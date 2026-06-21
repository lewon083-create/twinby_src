package yads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f41361a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f41362b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f41363c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f41364d;

    static {
        HashMap map = new HashMap();
        f41364d = map;
        yi1.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        yi1.a(-16711681, map, "aqua", -8388652, "aquamarine");
        yi1.a(-983041, map, "azure", -657956, "beige");
        yi1.a(-6972, map, "bisque", -16777216, "black");
        yi1.a(-5171, map, "blanchedalmond", -16776961, "blue");
        yi1.a(-7722014, map, "blueviolet", -5952982, "brown");
        yi1.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        yi1.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        yi1.a(-32944, map, "coral", -10185235, "cornflowerblue");
        yi1.a(-1828, map, "cornsilk", -2354116, "crimson");
        yi1.a(-16711681, map, "cyan", -16777077, "darkblue");
        yi1.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        yi1.a(-5658199, map, "darkgray", -16751616, "darkgreen");
        yi1.a(-5658199, map, "darkgrey", -4343957, "darkkhaki");
        yi1.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        yi1.a(-29696, map, "darkorange", -6737204, "darkorchid");
        yi1.a(-7667712, map, "darkred", -1468806, "darksalmon");
        yi1.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        yi1.a(-13676721, map, "darkslategray", -13676721, "darkslategrey");
        yi1.a(-16724271, map, "darkturquoise", -7077677, "darkviolet");
        yi1.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        yi1.a(-9868951, map, "dimgray", -9868951, "dimgrey");
        yi1.a(-14774017, map, "dodgerblue", -5103070, "firebrick");
        yi1.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        yi1.a(-65281, map, "fuchsia", -2302756, "gainsboro");
        yi1.a(-460545, map, "ghostwhite", -10496, "gold");
        yi1.a(-2448096, map, "goldenrod", -8355712, "gray");
        yi1.a(-16744448, map, "green", -5374161, "greenyellow");
        yi1.a(-8355712, map, "grey", -983056, "honeydew");
        yi1.a(-38476, map, "hotpink", -3318692, "indianred");
        yi1.a(-11861886, map, "indigo", -16, "ivory");
        yi1.a(-989556, map, "khaki", -1644806, "lavender");
        yi1.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        yi1.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        yi1.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        yi1.a(-329006, map, "lightgoldenrodyellow", -2894893, "lightgray");
        yi1.a(-7278960, map, "lightgreen", -2894893, "lightgrey");
        yi1.a(-18751, map, "lightpink", -24454, "lightsalmon");
        yi1.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        yi1.a(-8943463, map, "lightslategray", -8943463, "lightslategrey");
        yi1.a(-5192482, map, "lightsteelblue", -32, "lightyellow");
        yi1.a(-16711936, map, "lime", -13447886, "limegreen");
        yi1.a(-331546, map, "linen", -65281, "magenta");
        yi1.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        yi1.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        yi1.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        yi1.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        yi1.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        yi1.a(-15132304, map, "midnightblue", -655366, "mintcream");
        yi1.a(-6943, map, "mistyrose", -6987, "moccasin");
        yi1.a(-8531, map, "navajowhite", -16777088, "navy");
        yi1.a(-133658, map, "oldlace", -8355840, "olive");
        yi1.a(-9728477, map, "olivedrab", -23296, "orange");
        yi1.a(-47872, map, "orangered", -2461482, "orchid");
        yi1.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        yi1.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        yi1.a(-4139, map, "papayawhip", -9543, "peachpuff");
        yi1.a(-3308225, map, "peru", -16181, "pink");
        yi1.a(-2252579, map, "plum", -5185306, "powderblue");
        yi1.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        yi1.a(-65536, map, "red", -4419697, "rosybrown");
        yi1.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        yi1.a(-360334, map, "salmon", -744352, "sandybrown");
        yi1.a(-13726889, map, "seagreen", -2578, "seashell");
        yi1.a(-6270419, map, "sienna", -4144960, "silver");
        yi1.a(-7876885, map, "skyblue", -9807155, "slateblue");
        yi1.a(-9404272, map, "slategray", -9404272, "slategrey");
        yi1.a(-1286, map, "snow", -16711809, "springgreen");
        yi1.a(-12156236, map, "steelblue", -2968436, "tan");
        yi1.a(-16744320, map, "teal", -2572328, "thistle");
        yi1.a(-40121, map, "tomato", 0, "transparent");
        yi1.a(-12525360, map, "turquoise", -1146130, "violet");
        yi1.a(-663885, map, "wheat", -1, "white");
        yi1.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z5) {
        int iF;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
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
            Matcher matcher = (z5 ? f41363c : f41362b).matcher(strReplace);
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
            Matcher matcher2 = f41361a.matcher(strReplace);
            if (matcher2.matches()) {
                int iF2 = l7.o.f(matcher2, 1, 10);
                int iF3 = l7.o.f(matcher2, 2, 10);
                String strGroup2 = matcher2.group(3);
                strGroup2.getClass();
                return Color.rgb(iF2, iF3, Integer.parseInt(strGroup2, 10));
            }
        } else {
            Integer num = (Integer) f41364d.get(ki.a(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
