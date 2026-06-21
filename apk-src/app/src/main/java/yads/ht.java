package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ht extends pt {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39305h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39306j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f39310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f39311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f39316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f39317u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f39320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f39302y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f39303z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, VKApiCodes.CODE_ACCESS_DENIED_TO_AUDIO, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 202, VKApiCodes.CODE_ACCESS_DENIED_TO_GROUP, 235, 206, 207, 239, VKApiCodes.CODE_ERROR_WALL_ACCESS_REPLIES, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb2 f39304g = new lb2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f39308l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gt f39309m = new gt(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f39318v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f39307k = 16000000;

    public ht(String str, int i) {
        this.f39305h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f39306j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.f39306j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.f39306j = 0;
            this.i = 1;
        } else if (i != 4) {
            kh1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f39306j = 0;
            this.i = 0;
        } else {
            this.f39306j = 1;
            this.i = 1;
        }
        a(0);
        h();
        this.f39319w = true;
        this.f39320x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[FALL_THROUGH] */
    @Override // yads.pt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.nt r14) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ht.a(yads.nt):void");
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f39310n;
        this.f39311o = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt, yads.oa0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final a53 a() {
        a53 a53VarE;
        a53 a53VarA = super.a();
        if (a53VarA != null) {
            return a53VarA;
        }
        long j10 = this.f39307k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f39320x;
        if (j11 == -9223372036854775807L || this.f42015e - j11 < j10 || (a53VarE = e()) == null) {
            return null;
        }
        this.f39310n = Collections.EMPTY_LIST;
        this.f39320x = -9223372036854775807L;
        qt qtVarC = c();
        long j12 = this.f42015e;
        a53VarE.f43616c = j12;
        a53VarE.f36636d = qtVarC;
        a53VarE.f36637e = j12;
        return a53VarE;
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f39310n != this.f39311o;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f39310n = null;
        this.f39311o = null;
        a(0);
        this.f39313q = 4;
        this.f39309m.f38869h = 4;
        h();
        this.f39314r = false;
        this.f39315s = false;
        this.f39316t = (byte) 0;
        this.f39317u = (byte) 0;
        this.f39318v = 0;
        this.f39319w = true;
        this.f39320x = -9223372036854775807L;
    }

    public final ArrayList g() {
        int size = this.f39308l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            o20 o20VarA = ((gt) this.f39308l.get(i)).a(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
            arrayList.add(o20VarA);
            if (o20VarA != null) {
                iMin = Math.min(iMin, o20VarA.f41444j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            o20 o20VarA2 = (o20) arrayList.get(i10);
            if (o20VarA2 != null) {
                if (o20VarA2.f41444j != iMin) {
                    o20VarA2 = ((gt) this.f39308l.get(i10)).a(iMin);
                    o20VarA2.getClass();
                }
                arrayList2.add(o20VarA2);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.f39309m.b(this.f39312p);
        this.f39308l.clear();
        this.f39308l.add(this.f39309m);
    }

    @Override // yads.pt, yads.oa0
    public final void release() {
    }

    public final void a(int i) {
        int i10 = this.f39312p;
        if (i10 == i) {
            return;
        }
        this.f39312p = i;
        if (i == 3) {
            for (int i11 = 0; i11 < this.f39308l.size(); i11++) {
                ((gt) this.f39308l.get(i11)).f38868g = i;
            }
            return;
        }
        h();
        if (i10 == 3 || i == 1 || i == 0) {
            this.f39310n = Collections.EMPTY_LIST;
        }
    }
}
