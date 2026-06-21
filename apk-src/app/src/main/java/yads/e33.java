package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e33 extends iz2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f37996r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f37997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f33 f37998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f37999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f38000p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f38001q = -3.4028235E38f;

    public e33(List list) {
        if (list == null || list.isEmpty()) {
            this.f37997m = false;
            this.f37998n = null;
            return;
        }
        this.f37997m = true;
        String strA = lb3.a((byte[]) list.get(0));
        ni.a(strA.startsWith("Format:"));
        this.f37998n = (f33) ni.a(f33.a(strA));
        a(new lb2((byte[]) list.get(1)));
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j10));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00fd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d7 A[LOOP:2: B:148:0x02d5->B:149:0x02d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012c A[SYNTHETIC] */
    @Override // yads.iz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.u43 a(byte[] r37, int r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e33.a(byte[], int, boolean):yads.u43");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x030e, code lost:
    
        r28.f37999o = r3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209 A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:108:0x01cc, B:110:0x01da, B:111:0x01e0, B:119:0x0205, B:121:0x0209, B:123:0x0218, B:125:0x021c, B:127:0x022b, B:129:0x022f, B:130:0x0235, B:135:0x0259, B:137:0x025d, B:141:0x026e, B:143:0x0272, B:147:0x0283, B:149:0x0287, B:153:0x0298, B:155:0x029c, B:159:0x02ad, B:161:0x02b1, B:162:0x02b7, B:169:0x02da, B:167:0x02c7, B:133:0x023d, B:117:0x01f2), top: B:193:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021c A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:108:0x01cc, B:110:0x01da, B:111:0x01e0, B:119:0x0205, B:121:0x0209, B:123:0x0218, B:125:0x021c, B:127:0x022b, B:129:0x022f, B:130:0x0235, B:135:0x0259, B:137:0x025d, B:141:0x026e, B:143:0x0272, B:147:0x0283, B:149:0x0287, B:153:0x0298, B:155:0x029c, B:159:0x02ad, B:161:0x02b1, B:162:0x02b7, B:169:0x02da, B:167:0x02c7, B:133:0x023d, B:117:0x01f2), top: B:193:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022f A[Catch: RuntimeException -> 0x01ef, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:108:0x01cc, B:110:0x01da, B:111:0x01e0, B:119:0x0205, B:121:0x0209, B:123:0x0218, B:125:0x021c, B:127:0x022b, B:129:0x022f, B:130:0x0235, B:135:0x0259, B:137:0x025d, B:141:0x026e, B:143:0x0272, B:147:0x0283, B:149:0x0287, B:153:0x0298, B:155:0x029c, B:159:0x02ad, B:161:0x02b1, B:162:0x02b7, B:169:0x02da, B:167:0x02c7, B:133:0x023d, B:117:0x01f2), top: B:193:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b1 A[Catch: RuntimeException -> 0x01ef, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:108:0x01cc, B:110:0x01da, B:111:0x01e0, B:119:0x0205, B:121:0x0209, B:123:0x0218, B:125:0x021c, B:127:0x022b, B:129:0x022f, B:130:0x0235, B:135:0x0259, B:137:0x025d, B:141:0x026e, B:143:0x0272, B:147:0x0283, B:149:0x0287, B:153:0x0298, B:155:0x029c, B:159:0x02ad, B:161:0x02b1, B:162:0x02b7, B:169:0x02da, B:167:0x02c7, B:133:0x023d, B:117:0x01f2), top: B:193:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.lb2 r29) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e33.a(yads.lb2):void");
    }

    public static long a(String str) {
        Matcher matcher = f37996r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = lb3.f40466a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }
}
