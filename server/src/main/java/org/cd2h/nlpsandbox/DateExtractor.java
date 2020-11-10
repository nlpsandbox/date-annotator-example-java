package org.cd2h.nlpsandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openapitools.model.DateAnnotation;

public class DateExtractor {

    class NamedPattern{
        public String name;
        public Pattern pattern;

        public NamedPattern(String name, Pattern pattern){
            this.name = name;
            this.pattern = pattern;
        }
    }

    class Span{
        int begin;
        int end;
        int length;

        public Span(int begin, int end){
            this.begin = begin;
            this.end = end;
            this.length = end - begin;
        }
    }

    static ArrayList<NamedPattern> datePatterns;

    public DateExtractor(){
        // refer to https://github.com/Sage-Bionetworks/nlp-sandbox-date-annotator-example/blob/develop/server/openapi_server/controllers/date_controller.py#L32-L47
        // "MM/DD/YYYY" and  "MM-DD-YYYY"
        datePatterns = new ArrayList<>();
        datePatterns.add(new NamedPattern("DD/MM/YYYY",
                Pattern.compile(
                        "\\b([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])(/)([1-9]|0[1-9]|1[0-2])(/)(19[0-9][0-9]|20[0-9][0-9])")));

        datePatterns.add(new NamedPattern("MM/DD/YYYY",
                Pattern.compile(
                        "\\b([1-9]|0[1-9]|1[0-2])(/)([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])(/)(19[0-9][0-9]|20[0-9][0-9])")));

        datePatterns.add(new NamedPattern("MM-DD-YYYY",
                Pattern.compile(
                        "\\b([1-9]|0[1-9]|1[0-2])(-)([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])(-)(19[0-9][0-9]|20[0-9][0-9])")));


        datePatterns.add(new NamedPattern("MMMM", Pattern.compile("\\b(January|February|March|April|May|June|" +
                "July|August|September|October|November|" +
                "December)")));
    }

    public List<DateAnnotation> findDatesFromString(String sentence){

        ArrayList<DateAnnotation> annots = new ArrayList<>();
        for (NamedPattern np: datePatterns) {
            // Now create matcher object.
            Matcher m = np.pattern.matcher(sentence);
            while (m.find()) {
                System.out.println(String.format("Found matched pattern \"%s\" in value: %s", np.name, m.group(0) ));

                annots.add(new DateAnnotation()
                        .start(m.start(0))
                        .length(m.group(0).length())
                        .noteId(null)
                        .text(m.group(0))
                        .format(np.name));
            }
        }
        return annots;
    }

    public static void main(String[] args) {
        DateExtractor de = new DateExtractor();
        String str1 = "Today is 10/26/2020, and yesterday is 10/25/2020. ";
        de.findDatesFromString(str1);

        String str2 = "Today is 26/11/2020. ";
        de.findDatesFromString(str2);

    }
}
