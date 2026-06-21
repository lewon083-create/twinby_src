package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 implements a7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f11681c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f11682d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f11683e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f11684f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f11685g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f11686h = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern i = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v7 f11687j = new v7(30.0f, 1, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XmlPullParserFactory f11688b;

    public w7() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f11688b = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0202 A[Catch: y6 -> 0x026a, TryCatch #0 {y6 -> 0x026a, blocks: (B:85:0x0191, B:88:0x01ac, B:91:0x01be, B:93:0x01c4, B:95:0x01cb, B:104:0x01e3, B:114:0x01fc, B:116:0x0202, B:117:0x020a, B:118:0x020b, B:119:0x0228, B:108:0x01ee, B:113:0x01fa, B:120:0x0229, B:121:0x022a, B:122:0x0247, B:90:0x01b3, B:123:0x0248, B:124:0x0269), top: B:222:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.y7 b(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.y7 r17) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.b(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.y7):com.google.android.gms.internal.ads.y7");
    }

    public static y7 d(y7 y7Var) {
        return y7Var == null ? new y7() : y7Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Layout.Alignment e(String str) {
        String strH = ix.h(str);
        switch (strH.hashCode()) {
            case -1364013995:
                if (strH.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strH.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strH.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strH.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strH.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long f(String str, v7 v7Var) throws y6 {
        double d10;
        double d11;
        Matcher matcher = f11681c.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            double d17 = matcher.group(5) != null ? Long.parseLong(r12) / v7Var.f11283a : 0.0d;
            double d18 = d16 + d15;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r12) / ((double) v7Var.f11284b)) / ((double) v7Var.f11283a);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f11682d.matcher(str);
        if (!matcher2.matches()) {
            throw new y6("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d19 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals("s");
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d10 = v7Var.f11285c;
                            d19 /= d10;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d10 = 1000.0d;
                        d19 /= d10;
                    }
                } else if (strGroup6.equals("m")) {
                    d11 = 60.0d;
                    d19 *= d11;
                }
            } else if (strGroup6.equals("h")) {
                d11 = 3600.0d;
                d19 *= d11;
            }
        } else if (strGroup6.equals("f")) {
            d10 = v7Var.f11283a;
            d19 /= d10;
        }
        return (long) (d19 * 1000000.0d);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:289:0x05d6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0400 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:411:0x07bb, B:124:0x0294, B:127:0x029c, B:129:0x02a5, B:131:0x02b6, B:133:0x02c0, B:135:0x02d0, B:137:0x02d6, B:139:0x02ec, B:141:0x02f2, B:280:0x0581, B:134:0x02c7, B:143:0x0301, B:146:0x030f, B:264:0x0531, B:149:0x032c, B:151:0x0334, B:153:0x033c, B:155:0x0344, B:162:0x0358, B:165:0x036b, B:167:0x0371, B:169:0x037e, B:191:0x03e6, B:193:0x03ec, B:195:0x03f2, B:197:0x03fa, B:199:0x0400, B:202:0x040f, B:204:0x0415, B:206:0x0422, B:226:0x0499, B:228:0x04a1, B:242:0x04e2, B:244:0x04ec, B:262:0x0524, B:207:0x042d, B:208:0x042e, B:209:0x042f, B:210:0x043c, B:213:0x0444, B:216:0x0452, B:218:0x0458, B:220:0x0463, B:221:0x0477, B:222:0x0478, B:223:0x0479, B:224:0x0486, B:171:0x0387, B:172:0x0388, B:173:0x0389, B:175:0x0396, B:178:0x03a0, B:181:0x03a9, B:183:0x03af, B:185:0x03ba, B:186:0x03ca, B:187:0x03cb, B:188:0x03cc, B:189:0x03d4, B:267:0x0544, B:269:0x0551, B:271:0x055c, B:273:0x0562, B:275:0x056e, B:285:0x05a8, B:288:0x05ca, B:293:0x05e2, B:296:0x05eb, B:383:0x073a, B:305:0x0611, B:308:0x061c, B:310:0x0635, B:342:0x06b6, B:309:0x0627, B:325:0x0667, B:331:0x0680, B:335:0x0697, B:339:0x06ae, B:347:0x06d0, B:351:0x06dc, B:355:0x06e5, B:363:0x06f8, B:372:0x070e, B:374:0x071a, B:376:0x071f, B:378:0x0723, B:379:0x072a, B:367:0x0701, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:387:0x075e, B:389:0x076a, B:390:0x0771, B:392:0x0778, B:395:0x077c, B:397:0x0786, B:399:0x0790, B:403:0x0798, B:401:0x0795, B:406:0x07b0, B:410:0x07b8, B:416:0x07da), top: B:447:0x0008, inners: #3, #12, #13, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a1 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:411:0x07bb, B:124:0x0294, B:127:0x029c, B:129:0x02a5, B:131:0x02b6, B:133:0x02c0, B:135:0x02d0, B:137:0x02d6, B:139:0x02ec, B:141:0x02f2, B:280:0x0581, B:134:0x02c7, B:143:0x0301, B:146:0x030f, B:264:0x0531, B:149:0x032c, B:151:0x0334, B:153:0x033c, B:155:0x0344, B:162:0x0358, B:165:0x036b, B:167:0x0371, B:169:0x037e, B:191:0x03e6, B:193:0x03ec, B:195:0x03f2, B:197:0x03fa, B:199:0x0400, B:202:0x040f, B:204:0x0415, B:206:0x0422, B:226:0x0499, B:228:0x04a1, B:242:0x04e2, B:244:0x04ec, B:262:0x0524, B:207:0x042d, B:208:0x042e, B:209:0x042f, B:210:0x043c, B:213:0x0444, B:216:0x0452, B:218:0x0458, B:220:0x0463, B:221:0x0477, B:222:0x0478, B:223:0x0479, B:224:0x0486, B:171:0x0387, B:172:0x0388, B:173:0x0389, B:175:0x0396, B:178:0x03a0, B:181:0x03a9, B:183:0x03af, B:185:0x03ba, B:186:0x03ca, B:187:0x03cb, B:188:0x03cc, B:189:0x03d4, B:267:0x0544, B:269:0x0551, B:271:0x055c, B:273:0x0562, B:275:0x056e, B:285:0x05a8, B:288:0x05ca, B:293:0x05e2, B:296:0x05eb, B:383:0x073a, B:305:0x0611, B:308:0x061c, B:310:0x0635, B:342:0x06b6, B:309:0x0627, B:325:0x0667, B:331:0x0680, B:335:0x0697, B:339:0x06ae, B:347:0x06d0, B:351:0x06dc, B:355:0x06e5, B:363:0x06f8, B:372:0x070e, B:374:0x071a, B:376:0x071f, B:378:0x0723, B:379:0x072a, B:367:0x0701, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:387:0x075e, B:389:0x076a, B:390:0x0771, B:392:0x0778, B:395:0x077c, B:397:0x0786, B:399:0x0790, B:403:0x0798, B:401:0x0795, B:406:0x07b0, B:410:0x07b8, B:416:0x07da), top: B:447:0x0008, inners: #3, #12, #13, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ec A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:411:0x07bb, B:124:0x0294, B:127:0x029c, B:129:0x02a5, B:131:0x02b6, B:133:0x02c0, B:135:0x02d0, B:137:0x02d6, B:139:0x02ec, B:141:0x02f2, B:280:0x0581, B:134:0x02c7, B:143:0x0301, B:146:0x030f, B:264:0x0531, B:149:0x032c, B:151:0x0334, B:153:0x033c, B:155:0x0344, B:162:0x0358, B:165:0x036b, B:167:0x0371, B:169:0x037e, B:191:0x03e6, B:193:0x03ec, B:195:0x03f2, B:197:0x03fa, B:199:0x0400, B:202:0x040f, B:204:0x0415, B:206:0x0422, B:226:0x0499, B:228:0x04a1, B:242:0x04e2, B:244:0x04ec, B:262:0x0524, B:207:0x042d, B:208:0x042e, B:209:0x042f, B:210:0x043c, B:213:0x0444, B:216:0x0452, B:218:0x0458, B:220:0x0463, B:221:0x0477, B:222:0x0478, B:223:0x0479, B:224:0x0486, B:171:0x0387, B:172:0x0388, B:173:0x0389, B:175:0x0396, B:178:0x03a0, B:181:0x03a9, B:183:0x03af, B:185:0x03ba, B:186:0x03ca, B:187:0x03cb, B:188:0x03cc, B:189:0x03d4, B:267:0x0544, B:269:0x0551, B:271:0x055c, B:273:0x0562, B:275:0x056e, B:285:0x05a8, B:288:0x05ca, B:293:0x05e2, B:296:0x05eb, B:383:0x073a, B:305:0x0611, B:308:0x061c, B:310:0x0635, B:342:0x06b6, B:309:0x0627, B:325:0x0667, B:331:0x0680, B:335:0x0697, B:339:0x06ae, B:347:0x06d0, B:351:0x06dc, B:355:0x06e5, B:363:0x06f8, B:372:0x070e, B:374:0x071a, B:376:0x071f, B:378:0x0723, B:379:0x072a, B:367:0x0701, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:387:0x075e, B:389:0x076a, B:390:0x0771, B:392:0x0778, B:395:0x077c, B:397:0x0786, B:399:0x0790, B:403:0x0798, B:401:0x0795, B:406:0x07b0, B:410:0x07b8, B:416:0x07da), top: B:447:0x0008, inners: #3, #12, #13, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x018d, B:90:0x01e6, B:93:0x01fa, B:95:0x0200, B:97:0x0208, B:99:0x0210, B:101:0x0218, B:103:0x0220, B:105:0x0228, B:107:0x022e, B:109:0x0236, B:111:0x023e, B:113:0x0244, B:115:0x024a, B:117:0x0250, B:119:0x0258, B:122:0x0261, B:411:0x07bb, B:124:0x0294, B:127:0x029c, B:129:0x02a5, B:131:0x02b6, B:133:0x02c0, B:135:0x02d0, B:137:0x02d6, B:139:0x02ec, B:141:0x02f2, B:280:0x0581, B:134:0x02c7, B:143:0x0301, B:146:0x030f, B:264:0x0531, B:149:0x032c, B:151:0x0334, B:153:0x033c, B:155:0x0344, B:162:0x0358, B:165:0x036b, B:167:0x0371, B:169:0x037e, B:191:0x03e6, B:193:0x03ec, B:195:0x03f2, B:197:0x03fa, B:199:0x0400, B:202:0x040f, B:204:0x0415, B:206:0x0422, B:226:0x0499, B:228:0x04a1, B:242:0x04e2, B:244:0x04ec, B:262:0x0524, B:207:0x042d, B:208:0x042e, B:209:0x042f, B:210:0x043c, B:213:0x0444, B:216:0x0452, B:218:0x0458, B:220:0x0463, B:221:0x0477, B:222:0x0478, B:223:0x0479, B:224:0x0486, B:171:0x0387, B:172:0x0388, B:173:0x0389, B:175:0x0396, B:178:0x03a0, B:181:0x03a9, B:183:0x03af, B:185:0x03ba, B:186:0x03ca, B:187:0x03cb, B:188:0x03cc, B:189:0x03d4, B:267:0x0544, B:269:0x0551, B:271:0x055c, B:273:0x0562, B:275:0x056e, B:285:0x05a8, B:288:0x05ca, B:293:0x05e2, B:296:0x05eb, B:383:0x073a, B:305:0x0611, B:308:0x061c, B:310:0x0635, B:342:0x06b6, B:309:0x0627, B:325:0x0667, B:331:0x0680, B:335:0x0697, B:339:0x06ae, B:347:0x06d0, B:351:0x06dc, B:355:0x06e5, B:363:0x06f8, B:372:0x070e, B:374:0x071a, B:376:0x071f, B:378:0x0723, B:379:0x072a, B:367:0x0701, B:74:0x019a, B:76:0x01a4, B:79:0x01ad, B:81:0x01b3, B:83:0x01be, B:84:0x01c8, B:85:0x01c9, B:86:0x01ca, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x0162, B:63:0x0175, B:70:0x0185, B:67:0x017f, B:69:0x0184, B:387:0x075e, B:389:0x076a, B:390:0x0771, B:392:0x0778, B:395:0x077c, B:397:0x0786, B:399:0x0790, B:403:0x0798, B:401:0x0795, B:406:0x07b0, B:410:0x07b8, B:416:0x07da), top: B:447:0x0008, inners: #3, #12, #13, #14, #16 }] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v74, types: [com.google.android.gms.internal.ads.x7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.c3] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v32 */
    /* JADX WARN: Type inference failed for: r17v33 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v41 */
    /* JADX WARN: Type inference failed for: r17v42 */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r17v44 */
    /* JADX WARN: Type inference failed for: r17v45 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r50v1, types: [com.google.android.gms.internal.ads.y7, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.google.android.gms.internal.ads.v7] */
    /* JADX WARN: Type inference failed for: r9v16, types: [com.google.android.gms.internal.ads.v7] */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.google.android.gms.internal.ads.v7] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.z7 a(byte[] r49, int r50, int r51) {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.a(byte[], int, int):com.google.android.gms.internal.ads.z7");
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final void c(int i10, int i11, a4.g gVar, byte[] bArr) {
        nz.g(a(bArr, i10, i11), gVar);
    }
}
