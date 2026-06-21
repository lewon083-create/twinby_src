package k5;

import ad.b1;
import ad.h0;
import ad.j0;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.x2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import q4.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements q4.k {
    public long A;
    public q4.m B;
    public k[] C;
    public long[][] D;
    public int E;
    public z4.b F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.k f26960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.p f26963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.p f26964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.p f26965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.p f26966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f26967h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f26968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f26969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f26972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m3.p f26974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f26977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f26979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f26981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f26982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26983y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f26984z;

    public l(n5.k kVar, int i) {
        this.f26960a = kVar;
        this.f26961b = i;
        this.f26962c = (i & 256) != 0;
        h0 h0Var = j0.f818c;
        this.f26969k = b1.f768f;
        this.f26970l = (i & 4) != 0 ? 3 : 0;
        this.i = new o();
        this.f26968j = new ArrayList();
        this.f26966g = new m3.p(16);
        this.f26967h = new ArrayDeque();
        this.f26963d = new m3.p(n3.n.f29087a);
        this.f26964e = new m3.p(6);
        this.f26965f = new m3.p();
        this.f26975q = -1;
        this.B = q4.m.X1;
        this.C = new k[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x058d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x000e A[EDGE_INSN: B:408:0x000e->B:6:0x000e BREAK  A[LOOP:0: B:7:0x0012->B:409:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r40, com.google.android.gms.internal.ads.e2 r41) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.l.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        if ((this.f26961b & 16) == 0) {
            mVar = new b7(mVar, this.f26960a);
        }
        this.B = mVar;
    }

    @Override // q4.k
    public final List c() {
        return this.f26969k;
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        b1 b1VarW;
        x xVarL = p.l(lVar, false, (this.f26961b & 2) != 0);
        if (xVarL != null) {
            b1VarW = j0.w(xVarL);
        } else {
            h0 h0Var = j0.f818c;
            b1VarW = b1.f768f;
        }
        this.f26969k = b1VarW;
        return xVarL == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0134 A[EDGE_INSN: B:263:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r43) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.l.e(long):void");
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f26967h.clear();
        this.f26973o = 0;
        this.f26975q = -1;
        this.f26976r = 0;
        this.f26977s = 0;
        this.f26978t = 0;
        this.f26979u = false;
        this.f26984z = false;
        if (j10 == 0) {
            if (this.f26970l != 3) {
                this.f26970l = 0;
                this.f26973o = 0;
                return;
            } else {
                o oVar = this.i;
                oVar.f26990a.clear();
                oVar.f26991b = 0;
                this.f26968j.clear();
                return;
            }
        }
        for (k kVar : this.C) {
            s sVar = kVar.f26955b;
            int iA = sVar.a(j11);
            if (iA == -1) {
                iA = sVar.b(j11);
            }
            kVar.f26958e = iA;
            x2 x2Var = kVar.f26957d;
            if (x2Var != null) {
                x2Var.f11977b = false;
                x2Var.f11978c = 0;
            }
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
