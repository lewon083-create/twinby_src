package yads;

import android.text.Layout;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Geo;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u93 extends iz2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f43606n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f43607o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f43608p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f43609q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f43610r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f43611s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f43612t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s93 f43613u = new s93(30.0f, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r93 f43614v = new r93(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f43615m;

    public u93() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f43615m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static y93 a(y93 y93Var) {
        return y93Var == null ? new y93() : y93Var;
    }

    public static Layout.Alignment b(String str) {
        String strA = ki.a(str);
        strA.getClass();
        switch (strA) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // yads.iz2
    public final u43 a(byte[] bArr, int i, boolean z5) throws w43 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f43615m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new w93("", -3.4028235E38f, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR));
            t93 t93VarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = 0;
            s93 s93VarA = f43613u;
            r93 r93VarA = f43614v;
            z93 z93Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                v93 v93Var = (v93) arrayDeque.peek();
                if (i10 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            s93VarA = a(xmlPullParserNewPullParser);
                            r93VarA = a(xmlPullParserNewPullParser, f43614v);
                            t93VarB = b(xmlPullParserNewPullParser);
                        }
                        r93 r93Var = r93VarA;
                        s93 s93Var = s93VarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                a(xmlPullParserNewPullParser, map, r93Var, t93VarB, map2, map3);
                            } else {
                                try {
                                    v93 v93VarA = a(xmlPullParserNewPullParser, v93Var, map2, s93Var);
                                    arrayDeque.push(v93VarA);
                                    if (v93Var != null) {
                                        if (v93Var.f43970m == null) {
                                            v93Var.f43970m = new ArrayList();
                                        }
                                        v93Var.f43970m.add(v93VarA);
                                    }
                                } catch (w43 e3) {
                                    kh1.d("TtmlDecoder", kh1.a("Suppressing parser error", e3));
                                    r93VarA = r93Var;
                                    s93VarA = s93Var;
                                    i10++;
                                }
                            }
                            r93VarA = r93Var;
                            s93VarA = s93Var;
                        } else {
                            kh1.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        r93VarA = r93Var;
                        s93VarA = s93Var;
                        i10++;
                    } else if (eventType == 4) {
                        v93Var.getClass();
                        v93 v93VarA2 = v93.a(xmlPullParserNewPullParser.getText());
                        if (v93Var.f43970m == null) {
                            v93Var.f43970m = new ArrayList();
                        }
                        v93Var.f43970m.add(v93VarA2);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            v93 v93Var2 = (v93) arrayDeque.peek();
                            v93Var2.getClass();
                            z93Var = new z93(v93Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (z93Var != null) {
                return z93Var;
            }
            throw new w43("No TTML subtitles found");
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e10) {
            throw new w43("Unable to decode source", e10);
        }
    }

    public static t93 b(XmlPullParser xmlPullParser) {
        String strA = vp3.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f43611s.matcher(strA);
        if (!matcher.matches()) {
            kh1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new t93(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            kh1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    public static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(SentryLogEvent.JsonKeys.BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(Geo.JsonKeys.REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static r93 a(XmlPullParser xmlPullParser, r93 r93Var) throws w43 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return r93Var;
        }
        Matcher matcher = f43612t.matcher(attributeValue);
        if (!matcher.matches()) {
            kh1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return r93Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i10 = Integer.parseInt(strGroup2);
            if (i == 0 || i10 == 0) {
                throw new w43("Invalid cell resolution " + i + " " + i10);
            }
            return new r93(i10);
        } catch (NumberFormatException unused) {
            kh1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return r93Var;
        }
    }

    public static void a(String str, y93 y93Var) throws w43 {
        Matcher matcher;
        String strGroup;
        int i = lb3.f40466a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f43608p.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f43608p.matcher(strArrSplit[1]);
            kh1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new w43(t.z.d(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            strGroup = matcher.group(3);
            strGroup.getClass();
            switch (strGroup) {
                case "%":
                    y93Var.f44974j = 3;
                    break;
                case "em":
                    y93Var.f44974j = 2;
                    break;
                case "px":
                    y93Var.f44974j = 1;
                    break;
                default:
                    throw new w43(pe.a.f("Invalid unit for fontSize: '", strGroup, "'."));
            }
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            y93Var.f44975k = Float.parseFloat(strGroup2);
            return;
        }
        throw new w43(pe.a.f("Invalid expression for fontSize: '", str, "'."));
    }

    public static s93 a(XmlPullParser xmlPullParser) throws w43 {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = lb3.f40466a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new w43("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        s93 s93Var = f43613u;
        int i11 = s93Var.f42861b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = s93Var.f42862c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new s93(i * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, yads.r93 r22, yads.t93 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u93.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, yads.r93, yads.t93, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.v93 a(org.xmlpull.v1.XmlPullParser r21, yads.v93 r22, java.util.HashMap r23, yads.s93 r24) throws yads.w43 {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u93.a(org.xmlpull.v1.XmlPullParser, yads.v93, java.util.HashMap, yads.s93):yads.v93");
    }

    public static y93 a(XmlPullParser xmlPullParser, y93 y93Var) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    y93Var = a(y93Var);
                    y93Var.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "fontFamily":
                    y93Var = a(y93Var);
                    y93Var.f44966a = attributeValue;
                    break;
                case "textAlign":
                    y93Var = a(y93Var);
                    y93Var.f44979o = b(attributeValue);
                    break;
                case "textDecoration":
                    String strA = ki.a(attributeValue);
                    strA.getClass();
                    switch (strA) {
                        case "nounderline":
                            y93Var = a(y93Var);
                            y93Var.f44972g = 0;
                            break;
                        case "underline":
                            y93Var = a(y93Var);
                            y93Var.f44972g = 1;
                            break;
                        case "nolinethrough":
                            y93Var = a(y93Var);
                            y93Var.f44971f = 0;
                            break;
                        case "linethrough":
                            y93Var = a(y93Var);
                            y93Var.f44971f = 1;
                            break;
                    }
                    break;
                case "fontWeight":
                    y93Var = a(y93Var);
                    y93Var.f44973h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        y93Var = a(y93Var);
                        y93Var.f44976l = attributeValue;
                        break;
                    }
                    break;
                case "ruby":
                    String strA2 = ki.a(attributeValue);
                    strA2.getClass();
                    switch (strA2) {
                        case "baseContainer":
                        case "base":
                            y93Var = a(y93Var);
                            y93Var.f44977m = 2;
                            break;
                        case "container":
                            y93Var = a(y93Var);
                            y93Var.f44977m = 1;
                            break;
                        case "delimiter":
                            y93Var = a(y93Var);
                            y93Var.f44977m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            y93Var = a(y93Var);
                            y93Var.f44977m = 3;
                            break;
                    }
                    break;
                case "color":
                    y93Var = a(y93Var);
                    try {
                        y93Var.f44967b = nx.a(attributeValue, false);
                        y93Var.f44968c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        rk1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "shear":
                    y93Var = a(y93Var);
                    Matcher matcher = f43609q.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        rk1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    } else {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e3) {
                            kh1.d("TtmlDecoder", kh1.a("Failed to parse shear: " + attributeValue, e3));
                        }
                        break;
                    }
                    y93Var.f44983s = fMin;
                    break;
                case "textCombine":
                    String strA3 = ki.a(attributeValue);
                    strA3.getClass();
                    if (!strA3.equals("all")) {
                        if (strA3.equals(MeasurementUnit.NONE)) {
                            y93Var = a(y93Var);
                            y93Var.f44981q = 0;
                        }
                        break;
                    } else {
                        y93Var = a(y93Var);
                        y93Var.f44981q = 1;
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        y93Var = a(y93Var);
                        a(attributeValue, y93Var);
                        break;
                    } catch (w43 unused2) {
                        rk1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "textEmphasis":
                    y93Var = a(y93Var);
                    y93Var.f44982r = y53.a(attributeValue);
                    break;
                case "rubyPosition":
                    String strA4 = ki.a(attributeValue);
                    strA4.getClass();
                    if (!strA4.equals("before")) {
                        if (strA4.equals("after")) {
                            y93Var = a(y93Var);
                            y93Var.f44978n = 2;
                        }
                        break;
                    } else {
                        y93Var = a(y93Var);
                        y93Var.f44978n = 1;
                        break;
                    }
                    break;
                case "backgroundColor":
                    y93Var = a(y93Var);
                    try {
                        y93Var.f44969d = nx.a(attributeValue, false);
                        y93Var.f44970e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        rk1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "multiRowAlign":
                    y93Var = a(y93Var);
                    y93Var.f44980p = b(attributeValue);
                    break;
            }
        }
        return y93Var;
    }

    public static long a(String str, s93 s93Var) throws w43 {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f43606n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d13 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d14 = d13 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d15 = d14 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            double d16 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            double d17 = d15 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / s93Var.f42860a : 0.0d);
            if (matcher.group(6) != null) {
                d16 = (Long.parseLong(r13) / ((double) s93Var.f42861b)) / ((double) s93Var.f42860a);
            }
            return (long) ((d17 + d16) * 1000000.0d);
        }
        Matcher matcher2 = f43607o.matcher(str);
        if (matcher2.matches()) {
            String strGroup3 = matcher2.group(1);
            strGroup3.getClass();
            d10 = Double.parseDouble(strGroup3);
            String strGroup4 = matcher2.group(2);
            strGroup4.getClass();
            switch (strGroup4) {
                case "f":
                    d11 = s93Var.f42860a;
                    d10 /= d11;
                    return (long) (d10 * 1000000.0d);
                case "h":
                    d12 = 3600.0d;
                    break;
                case "m":
                    d12 = 60.0d;
                    break;
                case "t":
                    d11 = s93Var.f42862c;
                    d10 /= d11;
                    return (long) (d10 * 1000000.0d);
                case "ms":
                    d11 = 1000.0d;
                    d10 /= d11;
                    return (long) (d10 * 1000000.0d);
                default:
                    return (long) (d10 * 1000000.0d);
            }
            d10 *= d12;
            return (long) (d10 * 1000000.0d);
        }
        throw new w43(com.google.android.gms.internal.ads.om1.k("Malformed time expression: ", str));
    }
}
