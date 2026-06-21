package y6;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.v7;
import k6.a1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f36486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f36487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f36488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f36489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v7 f36492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36493h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36496l;

    public c(m mVar) {
        this.f36487b = mVar;
        k kVar = mVar.f36515k;
        this.f36488c = kVar;
        this.f36489d = (LinearLayoutManager) kVar.getLayoutManager();
        this.f36492g = new v7();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // k6.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f36495k = r6
            r5.d()
            boolean r0 = r5.f36494j
            r1 = -1
            com.google.android.gms.internal.ads.v7 r2 = r5.f36492g
            r3 = 0
            if (r0 == 0) goto L40
            r5.f36494j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            y6.m r8 = r5.f36487b
            y6.g r8 = r8.f36513h
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f11285c
            if (r7 == 0) goto L30
            int r7 = r2.f11284b
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f11284b
        L32:
            r5.i = r7
            int r8 = r5.f36493h
            if (r8 == r7) goto L50
            y6.e r8 = r5.f36486a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
            goto L50
        L40:
            int r7 = r5.f36490e
            if (r7 != 0) goto L50
            int r7 = r2.f11284b
            if (r7 != r1) goto L49
            r7 = r3
        L49:
            y6.e r8 = r5.f36486a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
        L50:
            int r7 = r2.f11284b
            if (r7 != r1) goto L55
            r7 = r3
        L55:
            float r8 = r2.f11283a
            int r0 = r2.f11285c
            y6.e r4 = r5.f36486a
            if (r4 == 0) goto L60
            r4.onPageScrolled(r7, r8, r0)
        L60:
            int r7 = r2.f11284b
            int r8 = r5.i
            if (r7 == r8) goto L68
            if (r8 != r1) goto L76
        L68:
            int r7 = r2.f11285c
            if (r7 != 0) goto L76
            int r7 = r5.f36491f
            if (r7 == r6) goto L76
            r5.b(r3)
            r5.c()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void b(int i) {
        if ((this.f36490e == 3 && this.f36491f == 0) || this.f36491f == i) {
            return;
        }
        this.f36491f = i;
        e eVar = this.f36486a;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
    }

    public final void c() {
        this.f36490e = 0;
        this.f36491f = 0;
        v7 v7Var = this.f36492g;
        v7Var.f11284b = -1;
        v7Var.f11283a = 0.0f;
        v7Var.f11285c = 0;
        this.f36493h = -1;
        this.i = -1;
        this.f36494j = false;
        this.f36495k = false;
        this.f36496l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.d():void");
    }

    @Override // k6.a1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        e eVar;
        e eVar2;
        int i10 = this.f36490e;
        if (!(i10 == 1 && this.f36491f == 1) && i == 1) {
            this.f36490e = 1;
            int i11 = this.i;
            if (i11 != -1) {
                this.f36493h = i11;
                this.i = -1;
            } else if (this.f36493h == -1) {
                this.f36493h = this.f36489d.m();
            }
            b(1);
            return;
        }
        if ((i10 == 1 || i10 == 4) && i == 2) {
            if (this.f36495k) {
                b(2);
                this.f36494j = true;
                return;
            }
            return;
        }
        v7 v7Var = this.f36492g;
        if ((i10 == 1 || i10 == 4) && i == 0) {
            d();
            if (!this.f36495k) {
                int i12 = v7Var.f11284b;
                if (i12 != -1 && (eVar2 = this.f36486a) != null) {
                    eVar2.onPageScrolled(i12, 0.0f, 0);
                }
            } else if (v7Var.f11285c == 0) {
                int i13 = this.f36493h;
                int i14 = v7Var.f11284b;
                if (i13 != i14 && (eVar = this.f36486a) != null) {
                    eVar.onPageSelected(i14);
                }
            }
            b(0);
            c();
        }
        if (this.f36490e == 2 && i == 0 && this.f36496l) {
            d();
            if (v7Var.f11285c == 0) {
                int i15 = this.i;
                int i16 = v7Var.f11284b;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    e eVar3 = this.f36486a;
                    if (eVar3 != null) {
                        eVar3.onPageSelected(i16);
                    }
                }
                b(0);
                c();
            }
        }
    }
}
