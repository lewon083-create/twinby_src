package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e30 extends DefaultHandler implements rb2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f37991b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f37992c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f37993d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f37994e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f37995a;

    public e30() {
        try {
            this.f37995a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i, long j12) {
        int i10;
        if (i >= 0) {
            i10 = i + 1;
        } else {
            int i11 = lb3.f40466a;
            i10 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new ix2(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static int b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        iBitCount = 6;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount <= 0 || iBitCount >= 33) {
                    iBitCount = -1;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    iBitCount = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    String strA = ki.a(attributeValue4);
                    strA.getClass();
                    switch (strA) {
                        case "4000":
                            iBitCount = 1;
                            break;
                        case "a000":
                            iBitCount = 2;
                            break;
                        case "f801":
                            break;
                        case "fa01":
                            iBitCount = 8;
                            break;
                        default:
                            iBitCount = -1;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i >= 0) {
                    int[] iArr = f37994e;
                    iBitCount = i >= iArr.length ? -1 : iArr[i];
                    break;
                } else {
                    iBitCount = -1;
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) == 0) {
                    iBitCount = -1;
                    break;
                }
                break;
            default:
                iBitCount = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!vp3.b(xmlPullParser, "AudioChannelConfiguration"));
        return iBitCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.c(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    @Override // yads.rb2
    public final Object a(Uri uri, r30 r30Var) throws qb2 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f37995a.newPullParser();
            xmlPullParserNewPullParser.setInput(r30Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return a(xmlPullParserNewPullParser, uri);
            }
            throw new qb2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e3) {
            throw new qb2(null, e3, true, 4);
        }
    }

    public static long a(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList a(XmlPullParser xmlPullParser, List list, boolean z5) throws XmlPullParserException, IOException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z5 ? 1 : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i10 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!vp3.b(xmlPullParser, "BaseURL"));
        if (text != null && ra3.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return sf1.a(new uo(i, i10, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            uo uoVar = (uo) list.get(i11);
            String strA = ra3.a(uoVar.f43742a, text);
            String str = attributeValue3 == null ? strA : attributeValue3;
            if (z5) {
                i = uoVar.f43744c;
                i10 = uoVar.f43745d;
                str = uoVar.f43743b;
            }
            arrayList.add(new uo(i, i10, strA, str));
        }
        return arrayList;
    }

    public static wf0 a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
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
        } while (!vp3.b(xmlPullParser, str));
        return new wf0(attributeValue, attributeValue2, str2);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = lb3.f40473h.matcher(attributeValue);
        if (matcher.matches()) {
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
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static rl2 a(XmlPullParser xmlPullParser, String str, String str2) {
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
        return new rl2(attributeValue, j10, j11);
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static jx2 a(XmlPullParser xmlPullParser, jx2 jx2Var) throws XmlPullParserException, IOException {
        long j10 = jx2Var != null ? jx2Var.f40378b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = jx2Var != null ? jx2Var.f40379c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = jx2Var != null ? jx2Var.f40008d : 0L;
        long j15 = jx2Var != null ? jx2Var.f40009e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        rl2 rl2VarA = jx2Var != null ? jx2Var.f40377a : null;
        while (true) {
            xmlPullParser.next();
            if (vp3.c(xmlPullParser, "Initialization")) {
                rl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else {
                a(xmlPullParser);
            }
            rl2 rl2Var = rl2VarA;
            if (vp3.b(xmlPullParser, "SegmentBase")) {
                return new jx2(rl2Var, j11, j13, j17, j16);
            }
            rl2VarA = rl2Var;
        }
    }

    public static gx2 a(XmlPullParser xmlPullParser, gx2 gx2Var, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = gx2Var != null ? gx2Var.f40378b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = gx2Var != null ? gx2Var.f40379c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = gx2Var != null ? gx2Var.f38571e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = gx2Var != null ? gx2Var.f38570d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        rl2 rl2VarA = null;
        List listA = null;
        do {
            xmlPullParser.next();
            if (vp3.c(xmlPullParser, "Initialization")) {
                rl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else if (vp3.c(xmlPullParser, "SegmentTimeline")) {
                listA = a(xmlPullParser, j16, j11);
            } else if (vp3.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a(xmlPullParser, "media", "mediaRange"));
            } else {
                a(xmlPullParser);
            }
        } while (!vp3.b(xmlPullParser, "SegmentList"));
        if (gx2Var != null) {
            if (rl2VarA == null) {
                rl2VarA = gx2Var.f40377a;
            }
            if (listA == null) {
                listA = gx2Var.f38572f;
            }
            if (arrayList == null) {
                arrayList = gx2Var.f38937j;
            }
        }
        return new gx2(rl2VarA, j16, j18, j22, j20, listA, j24, arrayList, lb3.a(j14), lb3.a(j10));
    }

    public static hx2 a(XmlPullParser xmlPullParser, hx2 hx2Var, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = hx2Var != null ? hx2Var.f40378b : 1L;
        rl2 rl2VarA = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = hx2Var != null ? hx2Var.f40379c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = hx2Var != null ? hx2Var.f38571e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = hx2Var != null ? hx2Var.f38570d : 1L;
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
            wf0 wf0Var = (wf0) list.get(i);
            if (ki.a("http://dashif.org/guidelines/last-segment-number", wf0Var.f44369a)) {
                j15 = Long.parseLong(wf0Var.f44370b);
                break;
            }
            i++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        ya3 ya3VarA = a(xmlPullParser, "media", hx2Var != null ? hx2Var.f39358k : null);
        ya3 ya3VarA2 = a(xmlPullParser, "initialization", hx2Var != null ? hx2Var.f39357j : null);
        List listA = null;
        do {
            xmlPullParser.next();
            if (vp3.c(xmlPullParser, "Initialization")) {
                rl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else if (vp3.c(xmlPullParser, "SegmentTimeline")) {
                listA = a(xmlPullParser, j17, j11);
            } else {
                a(xmlPullParser);
            }
        } while (!vp3.b(xmlPullParser, "SegmentTemplate"));
        if (hx2Var != null) {
            if (rl2VarA == null) {
                rl2VarA = hx2Var.f40377a;
            }
            if (listA == null) {
                listA = hx2Var.f38572f;
            }
        }
        return new hx2(rl2VarA, j17, j19, j23, j24, j21, listA, j26, ya3VarA2, ya3VarA, lb3.a(j14), lb3.a(j10));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c2. Please report as an issue. */
    public static ya3 a(XmlPullParser xmlPullParser, String str, ya3 ya3Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return ya3Var;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i] = a0.u.o(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i10 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i10);
                String strSubstring2 = attributeValue.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
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
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new ya3(strArr, iArr, strArr2, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0e56 A[LOOP:11: B:288:0x0851->B:541:0x0e56, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0a6e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.c30 a(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.a(org.xmlpull.v1.XmlPullParser, android.net.Uri):yads.c30");
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z5 = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (vp3.c(xmlPullParser, "S")) {
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
                a(xmlPullParser);
            }
        } while (!vp3.b(xmlPullParser, "SegmentTimeline"));
        if (!z5) {
            return arrayList;
        }
        a(arrayList, jA, j13, i, lb3.a(j11, j10, 1000L));
        return arrayList;
    }
}
