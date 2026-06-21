package m3;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f28557a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f28558b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f28559c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f28560d;

    static {
        HashMap map = new HashMap();
        f28560d = map;
        l7.o.q(-984833, map, "aliceblue", -332841, "antiquewhite");
        l7.o.u(map, "aqua", -16711681, -8388652, "aquamarine");
        l7.o.q(-983041, map, "azure", -657956, "beige");
        l7.o.q(-6972, map, "bisque", -16777216, "black");
        l7.o.q(-5171, map, "blanchedalmond", -16776961, "blue");
        l7.o.q(-7722014, map, "blueviolet", -5952982, "brown");
        l7.o.q(-2180985, map, "burlywood", -10510688, "cadetblue");
        l7.o.q(-8388864, map, "chartreuse", -2987746, "chocolate");
        l7.o.q(-32944, map, "coral", -10185235, "cornflowerblue");
        l7.o.q(-1828, map, "cornsilk", -2354116, "crimson");
        l7.o.u(map, "cyan", -16711681, -16777077, "darkblue");
        l7.o.q(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        l7.o.u(map, "darkgray", -5658199, -16751616, "darkgreen");
        l7.o.u(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        l7.o.q(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        l7.o.q(-29696, map, "darkorange", -6737204, "darkorchid");
        l7.o.q(-7667712, map, "darkred", -1468806, "darksalmon");
        l7.o.q(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        l7.o.u(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        l7.o.q(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        l7.o.u(map, "dodgerblue", -14774017, -5103070, "firebrick");
        l7.o.q(-1296, map, "floralwhite", -14513374, "forestgreen");
        l7.o.u(map, "fuchsia", -65281, -2302756, "gainsboro");
        l7.o.q(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        l7.o.q(-16744448, map, "green", -5374161, "greenyellow");
        l7.o.u(map, "grey", -8355712, -983056, "honeydew");
        l7.o.q(-38476, map, "hotpink", -3318692, "indianred");
        l7.o.q(-11861886, map, "indigo", -16, "ivory");
        l7.o.q(-989556, map, "khaki", -1644806, "lavender");
        l7.o.q(-3851, map, "lavenderblush", -8586240, "lawngreen");
        l7.o.q(-1331, map, "lemonchiffon", -5383962, "lightblue");
        l7.o.q(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        l7.o.q(-18751, map, "lightpink", -24454, "lightsalmon");
        l7.o.q(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        l7.o.u(map, "lightsteelblue", -5192482, -32, "lightyellow");
        l7.o.q(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        l7.o.q(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        l7.o.q(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        l7.o.q(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        l7.o.q(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        l7.o.q(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        l7.o.q(-15132304, map, "midnightblue", -655366, "mintcream");
        l7.o.q(-6943, map, "mistyrose", -6987, "moccasin");
        l7.o.q(-8531, map, "navajowhite", -16777088, "navy");
        l7.o.q(-133658, map, "oldlace", -8355840, "olive");
        l7.o.q(-9728477, map, "olivedrab", -23296, "orange");
        l7.o.q(-47872, map, "orangered", -2461482, "orchid");
        l7.o.q(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        l7.o.q(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        l7.o.q(-4139, map, "papayawhip", -9543, "peachpuff");
        l7.o.q(-3308225, map, "peru", -16181, "pink");
        l7.o.q(-2252579, map, "plum", -5185306, "powderblue");
        l7.o.q(-8388480, map, "purple", -10079335, "rebeccapurple");
        l7.o.q(-65536, map, "red", -4419697, "rosybrown");
        l7.o.q(-12490271, map, "royalblue", -7650029, "saddlebrown");
        l7.o.q(-360334, map, "salmon", -744352, "sandybrown");
        l7.o.q(-13726889, map, "seagreen", -2578, "seashell");
        l7.o.q(-6270419, map, "sienna", -4144960, "silver");
        l7.o.q(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        l7.o.u(map, "snow", -1286, -16711809, "springgreen");
        l7.o.q(-12156236, map, "steelblue", -2968436, "tan");
        l7.o.q(-16744320, map, "teal", -2572328, "thistle");
        l7.o.q(-40121, map, "tomato", 0, "transparent");
        l7.o.q(-12525360, map, "turquoise", -1146130, "violet");
        l7.o.q(-663885, map, "wheat", -1, "white");
        l7.o.q(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z5) {
        int iF;
        h5.h(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i;
            }
            if (strReplace.length() == 9) {
                return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (i >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z5 ? f28559c : f28558b).matcher(strReplace);
            if (matcher.matches()) {
                if (z5) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    iF = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    iF = l7.o.f(matcher, 4, 10);
                }
                return Color.argb(iF, l7.o.f(matcher, 1, 10), l7.o.f(matcher, 2, 10), l7.o.f(matcher, 3, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f28557a.matcher(strReplace);
            if (matcher2.matches()) {
                int iF2 = l7.o.f(matcher2, 1, 10);
                int iF3 = l7.o.f(matcher2, 2, 10);
                String strGroup2 = matcher2.group(3);
                strGroup2.getClass();
                return Color.rgb(iF2, iF3, Integer.parseInt(strGroup2, 10));
            }
        } else {
            Integer num = (Integer) f28560d.get(j4.x(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
