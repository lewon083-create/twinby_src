package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ij.g f42923a = ij.h.b(qf.f42285b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ij.g f42924b = ij.h.b(rf.f42583b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterator it = ek.u.g(new ek.p(3, str)).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String input = StringsKt.P((String) it.next()).toString();
            Regex regex = (Regex) f42924b.getValue();
            kotlin.text.q qVar = Regex.f27536c;
            regex.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            Matcher matcher = regex.f27537b.matcher(input);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            kotlin.text.o oVar = !matcher.find(0) ? null : new kotlin.text.o(matcher, input);
            String str2 = oVar != null ? (String) CollectionsKt.F(1, oVar.a()) : null;
            if (str2 != null) {
                thread = new Thread("[ExitInfo] ".concat(str2));
                linkedHashMap.put(thread, new ArrayList());
            } else if (kotlin.text.a0.n(input, "at ", false) && thread != null) {
                Regex regex2 = (Regex) f42923a.getValue();
                regex2.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Matcher matcher2 = regex2.f27537b.matcher(input);
                Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
                kotlin.text.o match = !matcher2.find(0) ? null : new kotlin.text.o(matcher2, input);
                if (match == null) {
                    stackTraceElement = null;
                    if (stackTraceElement == null && (list = (List) linkedHashMap.get(thread)) != null) {
                        list.add(stackTraceElement);
                    }
                } else {
                    Intrinsics.checkNotNullParameter(match, "match");
                    String str3 = (String) ((kotlin.text.l) match.a()).get(1);
                    String str4 = (String) ((kotlin.text.l) match.a()).get(2);
                    String str5 = (String) ((kotlin.text.l) match.a()).get(3);
                    Intrinsics.checkNotNullParameter(str3, "<this>");
                    String strSubstring = "";
                    Intrinsics.checkNotNullParameter("", "missingDelimiterValue");
                    int iF = StringsKt.F(str3, '.', 0, 6);
                    if (iF != -1) {
                        strSubstring = str3.substring(0, iF);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                    String strN = StringsKt.N(str3, str3);
                    try {
                        Integer intOrNull = StringsKt.toIntOrNull(str5);
                        stackTraceElement = new StackTraceElement(strSubstring, strN, str4, intOrNull != null ? intOrNull.intValue() : -1);
                    } catch (Throwable unused) {
                        stackTraceElement = null;
                    }
                    if (stackTraceElement == null) {
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.i0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
