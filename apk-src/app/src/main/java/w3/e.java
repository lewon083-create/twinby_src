package w3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.j4;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.rrweb.RRWebVideoEvent;
import j3.d0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.z;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements m4.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f35047c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f35048d = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f35049e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f35050f = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f35051g = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XmlPullParserFactory f35052b;

    public e() {
        try {
            this.f35052b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i, long j12) {
        int i10;
        if (i >= 0) {
            i10 = i + 1;
        } else {
            String str = z.f28608a;
            i10 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r13
      0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01ae, B:120:0x019b, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z5) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z5 ? 1 : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i10 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!m3.b.k(xmlPullParser, "BaseURL"));
        if (text != null && m3.b.i(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return ad.q.n(new b(i, i10, text, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String strP = m3.b.p(bVar.f35025a, text);
            String str = attributeValue3 == null ? strP : attributeValue3;
            if (z5) {
                i = bVar.f35027c;
                i10 = bVar.f35028d;
                str = bVar.f35026b;
            }
            arrayList2.add(new b(i, i10, strP, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if (RRWebVideoEvent.EVENT_TAG.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!m3.b.k(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = z.f28612e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d11 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d12 = d11 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d13 = d12 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d14 = d13 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d15 = d14 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d10 = Double.parseDouble(strGroup6);
        }
        long j11 = (long) ((d15 + d10) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    public static float j(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, RRWebVideoEvent.JsonKeys.FRAME_RATE);
        if (attributeValue != null) {
            Matcher matcher = f35047c.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0c65  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0caa A[LOOP:11: B:248:0x0691->B:506:0x0caa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0fb0 A[LOOP:5: B:159:0x0411->B:610:0x0fb0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x1387 A[LOOP:1: B:45:0x00cd->B:736:0x1387, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:744:0x1353 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0e36 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x08e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0b2e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w3.c k(org.xmlpull.v1.XmlPullParser r163, android.net.Uri r164) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):w3.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return new j(attributeValue, j10, j11);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j4.n("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f35053a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j10 = rVar != null ? rVar.f35095b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.f35096c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.f35092d : 0L;
        long j15 = rVar != null ? rVar.f35093e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVarL = rVar != null ? rVar.f35094a : null;
        while (true) {
            xmlPullParser.next();
            if (m3.b.m(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarL;
            if (m3.b.k(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j11, j13, j17, j16);
            }
            jVarL = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = oVar != null ? oVar.f35095b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.f35096c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.f35082e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.f35081d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVarL = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (m3.b.m(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (m3.b.m(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j16, j11);
            } else if (m3.b.m(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!m3.b.k(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarL == null) {
                jVarL = oVar.f35094a;
            }
            if (listS == null) {
                listS = oVar.f35083f;
            }
            if (arrayList == null) {
                arrayList = oVar.f35086j;
            }
        }
        return new o(jVarL, j16, j18, j22, j20, listS, j24, arrayList, z.M(j14), z.M(j10));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = pVar != null ? pVar.f35095b : 1L;
        j jVarL = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.f35096c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.f35082e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.f35081d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i);
            if (j4.n("http://dashif.org/guidelines/last-segment-number", fVar.f35053a)) {
                j15 = Long.parseLong(fVar.f35054b);
                break;
            }
            i++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        t9.q qVarT = t(xmlPullParser, "media", pVar != null ? pVar.f35088k : null);
        t9.q qVarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.f35087j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (m3.b.m(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (m3.b.m(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!m3.b.k(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarL == null) {
                jVarL = pVar.f35094a;
            }
            if (listS == null) {
                listS = pVar.f35083f;
            }
        }
        return new p(jVarL, j17, j19, j23, j24, j21, listS, j26, qVarT2, qVarT, z.M(j14), z.M(j10));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z5 = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (m3.b.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z5) {
                    int i10 = i;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i10, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != -9223372036854775807L) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z5 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!m3.b.k(xmlPullParser, "SegmentTimeline"));
        if (z5) {
            String str = z.f28608a;
            a(arrayList, jA, j13, i, z.U(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    public static t9.q t(XmlPullParser xmlPullParser, String str, t9.q qVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return qVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new t9.q(arrayList, arrayList2, arrayList3);
    }

    @Override // m4.p
    public final Object m(Uri uri, p3.j jVar) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f35052b.newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return k(xmlPullParserNewPullParser, uri);
            }
            throw d0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e3) {
            if (e3.getDetail() instanceof IOException) {
                throw ((IOException) e3.getDetail());
            }
            throw d0.b(null, e3);
        }
    }
}
