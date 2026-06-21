package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yo implements vo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f12671e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.a f12672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ys f12673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ox0 f12674d;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        h1.e eVar = new h1.e(7);
        for (int i = 0; i < 7; i++) {
            eVar.put(strArr[i], numArr[i]);
        }
        f12671e = Collections.unmodifiableMap(eVar);
    }

    public yo(p9.a aVar, ys ysVar, ox0 ox0Var) {
        this.f12672b = aVar;
        this.f12673c = ysVar;
        this.f12674d = ox0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044c A[Catch: all -> 0x01c6, TryCatch #1 {all -> 0x01c6, blocks: (B:92:0x01bb, B:94:0x01bf, B:95:0x01c4, B:99:0x01c9, B:101:0x01d1, B:102:0x01d6, B:104:0x01d8, B:106:0x01e2, B:107:0x01e7, B:109:0x01e9, B:111:0x01ef, B:112:0x01f4, B:114:0x01f6, B:116:0x0204, B:117:0x0216, B:119:0x0224, B:120:0x0236, B:122:0x0244, B:123:0x0256, B:125:0x0264, B:126:0x0276, B:128:0x0284, B:129:0x0292, B:131:0x02a0, B:132:0x02a2, B:134:0x02a6, B:136:0x02aa, B:138:0x02b0, B:141:0x02b8, B:145:0x02ee, B:151:0x0300, B:211:0x044c, B:212:0x0451, B:214:0x0453, B:216:0x047c, B:218:0x0488, B:220:0x04c0, B:226:0x0538, B:249:0x0593, B:250:0x05ab, B:251:0x05d5, B:253:0x05df, B:254:0x05ea, B:255:0x0610, B:258:0x0613, B:260:0x0641, B:261:0x0653, B:230:0x0549, B:234:0x055a, B:238:0x0569, B:242:0x0578, B:247:0x0589, B:248:0x058d, B:219:0x04bd, B:263:0x0655, B:264:0x065a, B:153:0x030e, B:155:0x0312, B:184:0x03bf, B:179:0x039c, B:186:0x03cc, B:188:0x03d0, B:190:0x03d4, B:193:0x03dc, B:161:0x032f, B:165:0x034c, B:166:0x0358, B:170:0x036e, B:174:0x0383, B:178:0x0395, B:183:0x03aa, B:194:0x03eb, B:201:0x0427, B:207:0x0437, B:204:0x042d, B:206:0x0435, B:197:0x041e, B:199:0x0424, B:208:0x043c, B:209:0x0443, B:266:0x065c, B:267:0x0661, B:269:0x0663, B:270:0x0668), top: B:297:0x01bb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0453 A[Catch: all -> 0x01c6, TryCatch #1 {all -> 0x01c6, blocks: (B:92:0x01bb, B:94:0x01bf, B:95:0x01c4, B:99:0x01c9, B:101:0x01d1, B:102:0x01d6, B:104:0x01d8, B:106:0x01e2, B:107:0x01e7, B:109:0x01e9, B:111:0x01ef, B:112:0x01f4, B:114:0x01f6, B:116:0x0204, B:117:0x0216, B:119:0x0224, B:120:0x0236, B:122:0x0244, B:123:0x0256, B:125:0x0264, B:126:0x0276, B:128:0x0284, B:129:0x0292, B:131:0x02a0, B:132:0x02a2, B:134:0x02a6, B:136:0x02aa, B:138:0x02b0, B:141:0x02b8, B:145:0x02ee, B:151:0x0300, B:211:0x044c, B:212:0x0451, B:214:0x0453, B:216:0x047c, B:218:0x0488, B:220:0x04c0, B:226:0x0538, B:249:0x0593, B:250:0x05ab, B:251:0x05d5, B:253:0x05df, B:254:0x05ea, B:255:0x0610, B:258:0x0613, B:260:0x0641, B:261:0x0653, B:230:0x0549, B:234:0x055a, B:238:0x0569, B:242:0x0578, B:247:0x0589, B:248:0x058d, B:219:0x04bd, B:263:0x0655, B:264:0x065a, B:153:0x030e, B:155:0x0312, B:184:0x03bf, B:179:0x039c, B:186:0x03cc, B:188:0x03d0, B:190:0x03d4, B:193:0x03dc, B:161:0x032f, B:165:0x034c, B:166:0x0358, B:170:0x036e, B:174:0x0383, B:178:0x0395, B:183:0x03aa, B:194:0x03eb, B:201:0x0427, B:207:0x0437, B:204:0x042d, B:206:0x0435, B:197:0x041e, B:199:0x0424, B:208:0x043c, B:209:0x0443, B:266:0x065c, B:267:0x0661, B:269:0x0663, B:270:0x0668), top: B:297:0x01bb, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058d A[Catch: all -> 0x01c6, TryCatch #1 {all -> 0x01c6, blocks: (B:92:0x01bb, B:94:0x01bf, B:95:0x01c4, B:99:0x01c9, B:101:0x01d1, B:102:0x01d6, B:104:0x01d8, B:106:0x01e2, B:107:0x01e7, B:109:0x01e9, B:111:0x01ef, B:112:0x01f4, B:114:0x01f6, B:116:0x0204, B:117:0x0216, B:119:0x0224, B:120:0x0236, B:122:0x0244, B:123:0x0256, B:125:0x0264, B:126:0x0276, B:128:0x0284, B:129:0x0292, B:131:0x02a0, B:132:0x02a2, B:134:0x02a6, B:136:0x02aa, B:138:0x02b0, B:141:0x02b8, B:145:0x02ee, B:151:0x0300, B:211:0x044c, B:212:0x0451, B:214:0x0453, B:216:0x047c, B:218:0x0488, B:220:0x04c0, B:226:0x0538, B:249:0x0593, B:250:0x05ab, B:251:0x05d5, B:253:0x05df, B:254:0x05ea, B:255:0x0610, B:258:0x0613, B:260:0x0641, B:261:0x0653, B:230:0x0549, B:234:0x055a, B:238:0x0569, B:242:0x0578, B:247:0x0589, B:248:0x058d, B:219:0x04bd, B:263:0x0655, B:264:0x065a, B:153:0x030e, B:155:0x0312, B:184:0x03bf, B:179:0x039c, B:186:0x03cc, B:188:0x03d0, B:190:0x03d4, B:193:0x03dc, B:161:0x032f, B:165:0x034c, B:166:0x0358, B:170:0x036e, B:174:0x0383, B:178:0x0395, B:183:0x03aa, B:194:0x03eb, B:201:0x0427, B:207:0x0437, B:204:0x042d, B:206:0x0435, B:197:0x041e, B:199:0x0424, B:208:0x043c, B:209:0x0443, B:266:0x065c, B:267:0x0661, B:269:0x0663, B:270:0x0668), top: B:297:0x01bb, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.lang.Object r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 1778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo.o(java.lang.Object, java.util.Map):void");
    }
}
