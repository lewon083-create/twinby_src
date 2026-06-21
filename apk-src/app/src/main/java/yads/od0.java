package yads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class od0 implements sq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f41513a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nd0 f41514b = new nd0(new zl.g0(12));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd0 f41515c = new nd0(new zl.g0(13));

    public static void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new f0());
                break;
            case 1:
                arrayList.add(new i0());
                break;
            case 2:
                arrayList.add(new pc());
                break;
            case 3:
                arrayList.add(new re());
                break;
            case 4:
                nq0 nq0VarA = f41514b.a(0);
                if (nq0VarA == null) {
                    arrayList.add(new uv0());
                } else {
                    arrayList.add(nq0VarA);
                }
                break;
            case 5:
                arrayList.add(new gw0());
                break;
            case 6:
                arrayList.add(new bj1(new jd0(), 0));
                break;
            case 7:
                arrayList.add(new kv1(0));
                break;
            case 8:
                arrayList.add(new tx0(Collections.EMPTY_LIST));
                arrayList.add(new mv1());
                break;
            case 9:
                arrayList.add(new o92());
                break;
            case 10:
                arrayList.add(new el2(new b73(0L)));
                break;
            case 11:
                arrayList.add(new k93(0));
                break;
            case 12:
                arrayList.add(new on3());
                break;
            case 14:
                arrayList.add(new ee1());
                break;
            case 15:
                nq0 nq0VarA2 = f41515c.a(new Object[0]);
                if (nq0VarA2 != null) {
                    arrayList.add(nq0VarA2);
                }
                break;
            case 16:
                arrayList.add(new yl());
                break;
        }
    }

    public static Constructor b() {
        return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(nq0.class).getConstructor(null);
    }

    @Override // yads.sq0
    public final synchronized nq0[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0200 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:160:0x0200, B:161:0x0203, B:261:0x0379, B:264:0x037f, B:267:0x0385, B:268:0x0388, B:269:0x038b, B:164:0x020b, B:166:0x0213, B:169:0x021d, B:172:0x0229, B:174:0x0231, B:177:0x023b, B:180:0x0246, B:183:0x0252, B:186:0x025e, B:188:0x0266, B:190:0x026e, B:193:0x0278, B:195:0x0286, B:198:0x0290, B:201:0x029b, B:203:0x02a3, B:205:0x02b1, B:207:0x02bf, B:210:0x02cf, B:212:0x02dd, B:215:0x02e7, B:217:0x02ef, B:219:0x02f7, B:221:0x02ff, B:224:0x0309, B:226:0x0311, B:229:0x0320, B:231:0x0328, B:234:0x0331, B:236:0x0339, B:239:0x0342, B:241:0x034a, B:244:0x0353, B:15:0x0045, B:34:0x007e, B:35:0x0082, B:141:0x01d6, B:37:0x0087, B:41:0x0095, B:45:0x00a3, B:49:0x00b1, B:53:0x00bf, B:57:0x00cd, B:61:0x00db, B:65:0x00e9, B:69:0x00f7, B:73:0x0105, B:77:0x0112, B:81:0x0120, B:85:0x012d, B:89:0x013a, B:93:0x0147, B:97:0x0154, B:101:0x0161, B:105:0x016e, B:109:0x017b, B:113:0x0186, B:117:0x0191, B:121:0x019d, B:125:0x01a9, B:129:0x01b4, B:133:0x01bf, B:137:0x01cb, B:22:0x005b, B:26:0x0067, B:30:0x0073), top: B:274:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:160:0x0200, B:161:0x0203, B:261:0x0379, B:264:0x037f, B:267:0x0385, B:268:0x0388, B:269:0x038b, B:164:0x020b, B:166:0x0213, B:169:0x021d, B:172:0x0229, B:174:0x0231, B:177:0x023b, B:180:0x0246, B:183:0x0252, B:186:0x025e, B:188:0x0266, B:190:0x026e, B:193:0x0278, B:195:0x0286, B:198:0x0290, B:201:0x029b, B:203:0x02a3, B:205:0x02b1, B:207:0x02bf, B:210:0x02cf, B:212:0x02dd, B:215:0x02e7, B:217:0x02ef, B:219:0x02f7, B:221:0x02ff, B:224:0x0309, B:226:0x0311, B:229:0x0320, B:231:0x0328, B:234:0x0331, B:236:0x0339, B:239:0x0342, B:241:0x034a, B:244:0x0353, B:15:0x0045, B:34:0x007e, B:35:0x0082, B:141:0x01d6, B:37:0x0087, B:41:0x0095, B:45:0x00a3, B:49:0x00b1, B:53:0x00bf, B:57:0x00cd, B:61:0x00db, B:65:0x00e9, B:69:0x00f7, B:73:0x0105, B:77:0x0112, B:81:0x0120, B:85:0x012d, B:89:0x013a, B:93:0x0147, B:97:0x0154, B:101:0x0161, B:105:0x016e, B:109:0x017b, B:113:0x0186, B:117:0x0191, B:121:0x019d, B:125:0x01a9, B:129:0x01b4, B:133:0x01bf, B:137:0x01cb, B:22:0x005b, B:26:0x0067, B:30:0x0073), top: B:274:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x037f A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:160:0x0200, B:161:0x0203, B:261:0x0379, B:264:0x037f, B:267:0x0385, B:268:0x0388, B:269:0x038b, B:164:0x020b, B:166:0x0213, B:169:0x021d, B:172:0x0229, B:174:0x0231, B:177:0x023b, B:180:0x0246, B:183:0x0252, B:186:0x025e, B:188:0x0266, B:190:0x026e, B:193:0x0278, B:195:0x0286, B:198:0x0290, B:201:0x029b, B:203:0x02a3, B:205:0x02b1, B:207:0x02bf, B:210:0x02cf, B:212:0x02dd, B:215:0x02e7, B:217:0x02ef, B:219:0x02f7, B:221:0x02ff, B:224:0x0309, B:226:0x0311, B:229:0x0320, B:231:0x0328, B:234:0x0331, B:236:0x0339, B:239:0x0342, B:241:0x034a, B:244:0x0353, B:15:0x0045, B:34:0x007e, B:35:0x0082, B:141:0x01d6, B:37:0x0087, B:41:0x0095, B:45:0x00a3, B:49:0x00b1, B:53:0x00bf, B:57:0x00cd, B:61:0x00db, B:65:0x00e9, B:69:0x00f7, B:73:0x0105, B:77:0x0112, B:81:0x0120, B:85:0x012d, B:89:0x013a, B:93:0x0147, B:97:0x0154, B:101:0x0161, B:105:0x016e, B:109:0x017b, B:113:0x0186, B:117:0x0191, B:121:0x019d, B:125:0x01a9, B:129:0x01b4, B:133:0x01bf, B:137:0x01cb, B:22:0x005b, B:26:0x0067, B:30:0x0073), top: B:274:0x0001 }] */
    @Override // yads.sq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized yads.nq0[] createExtractors(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.od0.createExtractors(android.net.Uri, java.util.Map):yads.nq0[]");
    }

    public static Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(nq0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
