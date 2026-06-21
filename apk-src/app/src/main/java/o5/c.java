package o5;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k6.t0;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f29717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29718k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f29722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f29723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f29728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f29729v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f29731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f29732y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f29715z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, VKApiCodes.CODE_ACCESS_DENIED_TO_AUDIO, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 202, VKApiCodes.CODE_ACCESS_DENIED_TO_GROUP, 235, 206, 207, 239, VKApiCodes.CODE_ERROR_WALL_ACCESS_REPLIES, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f29716h = new p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f29720m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f29721n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29730w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f29719l = 16000000;

    public c(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f29718k = 0;
            this.f29717j = 0;
        } else if (i == 2) {
            this.f29718k = 1;
            this.f29717j = 0;
        } else if (i == 3) {
            this.f29718k = 0;
            this.f29717j = 1;
        } else if (i != 4) {
            m3.b.s("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f29718k = 0;
            this.f29717j = 0;
        } else {
            this.f29718k = 1;
            this.f29717j = 1;
        }
        l(0);
        k();
        this.f29731x = true;
        this.f29732y = -9223372036854775807L;
    }

    @Override // o5.h
    public final t0 f() {
        List list = this.f29722o;
        this.f29723p = list;
        list.getClass();
        return new t0(5, list);
    }

    @Override // o5.h, r3.c
    public final void flush() {
        super.flush();
        this.f29722o = null;
        this.f29723p = null;
        l(0);
        this.f29725r = 4;
        this.f29721n.f29714h = 4;
        k();
        this.f29726s = false;
        this.f29727t = false;
        this.f29728u = (byte) 0;
        this.f29729v = (byte) 0;
        this.f29730w = 0;
        this.f29731x = true;
        this.f29732y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // o5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(o5.g r15) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c.g(o5.g):void");
    }

    @Override // o5.h, r3.c
    /* JADX INFO: renamed from: h */
    public final n5.d d() {
        n5.d dVar;
        n5.d dVarD = super.d();
        if (dVarD != null) {
            return dVarD;
        }
        long j10 = this.f29719l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f29732y;
        if (j11 == -9223372036854775807L || this.f29775e - j11 < j10 || (dVar = (n5.d) this.f29772b.pollFirst()) == null) {
            return null;
        }
        this.f29722o = Collections.EMPTY_LIST;
        this.f29732y = -9223372036854775807L;
        t0 t0VarF = f();
        long j12 = this.f29775e;
        dVar.f32196d = j12;
        dVar.f29109f = t0VarF;
        dVar.f29110g = j12;
        return dVar;
    }

    @Override // o5.h
    public final boolean i() {
        return this.f29722o != this.f29723p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f29720m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            l3.b bVarC = ((b) arrayList.get(i)).c(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            l3.b bVarC2 = (l3.b) arrayList2.get(i10);
            if (bVarC2 != null) {
                if (bVarC2.i != iMin) {
                    bVarC2 = ((b) arrayList.get(i10)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f29721n;
        bVar.f29713g = this.f29724q;
        bVar.f29707a.clear();
        bVar.f29708b.clear();
        bVar.f29709c.setLength(0);
        bVar.f29710d = 15;
        bVar.f29711e = 0;
        bVar.f29712f = 0;
        ArrayList arrayList = this.f29720m;
        arrayList.clear();
        arrayList.add(this.f29721n);
    }

    public final void l(int i) {
        int i10 = this.f29724q;
        if (i10 == i) {
            return;
        }
        this.f29724q = i;
        if (i != 3) {
            k();
            if (i10 == 3 || i == 1 || i == 0) {
                this.f29722o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f29720m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).f29713g = i;
            i11++;
        }
    }

    @Override // o5.h, r3.c
    public final void release() {
    }
}
