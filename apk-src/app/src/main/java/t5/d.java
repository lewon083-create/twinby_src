package t5;

import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.v7;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.varioqub.config.model.ConfigValue;
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
import m3.z;
import n5.g;
import n5.l;
import n5.m;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f33491c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f33492d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f33493e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f33494f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f33495g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f33496h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern i = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v7 f33497j = new v7(30.0f, 1, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XmlPullParserFactory f33498b;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f33498b = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static f a(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(SentryLogEvent.JsonKeys.BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(Geo.JsonKeys.REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = i.matcher(attributeValue);
        if (!matcher.matches()) {
            m3.b.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z5 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z5 = false;
            }
            h5.d(i10, i11, "Invalid cell resolution %s %s", z5);
            return i11;
        } catch (NumberFormatException unused) {
            m3.b.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) throws g {
        Matcher matcher;
        String strGroup;
        String str2 = z.f28608a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f33493e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new g(t.z.d(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            m3.b.s("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new g(pe.a.f("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.f33516j = 3;
                break;
            case "em":
                fVar.f33516j = 2;
                break;
            case "px":
                fVar.f33516j = 1;
                break;
            default:
                throw new g(pe.a.f("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.f33517k = Float.parseFloat(strGroup2);
    }

    public static v7 e(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", RRWebVideoEvent.JsonKeys.FRAME_RATE);
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = z.f28608a;
            h5.g("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        v7 v7Var = f33497j;
        int i11 = v7Var.f11284b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = v7Var.f11285c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new v7(i10 * f10, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, com.google.android.gms.internal.ads.c3 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, com.google.android.gms.internal.ads.c3, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t5.c g(org.xmlpull.v1.XmlPullParser r21, t5.c r22, java.util.HashMap r23, com.google.android.gms.internal.ads.v7 r24) throws n5.g {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.g(org.xmlpull.v1.XmlPullParser, t5.c, java.util.HashMap, com.google.android.gms.internal.ads.v7):t5.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t5.f h(org.xmlpull.v1.XmlPullParser r18, t5.f r19) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.h(org.xmlpull.v1.XmlPullParser, t5.f):t5.f");
    }

    public static long j(String str, v7 v7Var) throws g {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f33491c.matcher(str);
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
            double d17 = d15 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / v7Var.f11283a : 0.0d);
            if (matcher.group(6) != null) {
                d16 = (Long.parseLong(r13) / ((double) v7Var.f11284b)) / ((double) v7Var.f11283a);
            }
            return (long) ((d17 + d16) * 1000000.0d);
        }
        Matcher matcher2 = f33492d.matcher(str);
        if (!matcher2.matches()) {
            throw new g(om1.k("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d10 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d11 = v7Var.f11283a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = v7Var.f11285c;
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

    public static c3 k(XmlPullParser xmlPullParser) {
        String strH = m3.b.h(xmlPullParser, "extent");
        if (strH == null) {
            return null;
        }
        Matcher matcher = f33496h.matcher(strH);
        if (!matcher.matches()) {
            m3.b.s("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strH));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new c3(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            m3.b.s("TtmlParser", "Ignoring malformed tts extent: ".concat(strH));
            return null;
        }
    }

    @Override // n5.m
    public final n5.e i(byte[] bArr, int i10, int i11) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f33498b.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR));
            c3 c3VarK = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            v7 v7VarE = f33497j;
            int i12 = 0;
            int iC = 15;
            a1.m mVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            v7VarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            c3VarK = k(xmlPullParserNewPullParser);
                        }
                        v7 v7Var = v7VarE;
                        c3 c3Var = c3VarK;
                        int i13 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(xmlPullParserNewPullParser, map, i13, c3Var, map2, map3);
                            } else {
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar, map2, v7Var);
                                    arrayDeque.push(cVarG);
                                    if (cVar != null) {
                                        if (cVar.f33490m == null) {
                                            cVar.f33490m = new ArrayList();
                                        }
                                        cVar.f33490m.add(cVarG);
                                    }
                                } catch (g e3) {
                                    m3.b.t("TtmlParser", "Suppressing parser error", e3);
                                    i12++;
                                }
                            }
                            iC = i13;
                            c3VarK = c3Var;
                            v7VarE = v7Var;
                        } else {
                            m3.b.j("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iC = i13;
                        c3VarK = c3Var;
                        v7VarE = v7Var;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.f33490m == null) {
                            cVar.f33490m = new ArrayList();
                        }
                        cVar.f33490m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            mVar = new a1.m(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            mVar.getClass();
            return mVar;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e10) {
            throw new IllegalStateException("Unable to decode source", e10);
        }
    }

    @Override // n5.m
    public final void p(byte[] bArr, int i10, int i11, l lVar, m3.g gVar) {
        j0.g.T(i(bArr, i10, i11), lVar, gVar);
    }

    @Override // n5.m
    public final int s() {
        return 1;
    }
}
