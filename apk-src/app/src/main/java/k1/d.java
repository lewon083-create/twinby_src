package k1;

import ic.l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e[] f26816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e[] f26817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26818h;
    public h3.e i;

    @Override // k1.b
    public final e d(boolean[] zArr) {
        int i = -1;
        for (int i10 = 0; i10 < this.f26818h; i10++) {
            e[] eVarArr = this.f26816f;
            e eVar = eVarArr[i10];
            if (!zArr[eVar.f26820c]) {
                h3.e eVar2 = this.i;
                eVar2.f20375c = eVar;
                int i11 = 8;
                if (i == -1) {
                    while (i11 >= 0) {
                        float f10 = ((e) eVar2.f20375c).i[i11];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    e eVar3 = eVarArr[i];
                    while (true) {
                        if (i11 >= 0) {
                            float f11 = eVar3.i[i11];
                            float f12 = ((e) eVar2.f20375c).i[i11];
                            if (f12 == f11) {
                                i11--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f26816f[i];
    }

    @Override // k1.b
    public final boolean e() {
        return this.f26818h == 0;
    }

    @Override // k1.b
    public final void i(c cVar, b bVar, boolean z5) {
        e eVar = bVar.f26795a;
        if (eVar == null) {
            return;
        }
        float[] fArr = eVar.i;
        a aVar = bVar.f26798d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            e eVarE = aVar.e(i);
            float f10 = aVar.f(i);
            h3.e eVar2 = this.i;
            eVar2.f20375c = eVarE;
            if (eVarE.f26819b) {
                boolean z10 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((e) eVar2.f20375c).i;
                    float f11 = (fArr[i10] * f10) + fArr2[i10];
                    fArr2[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((e) eVar2.f20375c).i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((d) eVar2.f20376d).k((e) eVar2.f20375c);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = fArr[i11];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((e) eVar2.f20375c).i[i11] = f13;
                    } else {
                        ((e) eVar2.f20375c).i[i11] = 0.0f;
                    }
                }
                j(eVarE);
            }
            this.f26796b = (bVar.f26796b * f10) + this.f26796b;
        }
        k(eVar);
    }

    public final void j(e eVar) {
        int i;
        int i10 = this.f26818h + 1;
        e[] eVarArr = this.f26816f;
        if (i10 > eVarArr.length) {
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            this.f26816f = eVarArr2;
            this.f26817g = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length * 2);
        }
        e[] eVarArr3 = this.f26816f;
        int i11 = this.f26818h;
        eVarArr3[i11] = eVar;
        int i12 = i11 + 1;
        this.f26818h = i12;
        if (i12 > 1 && eVarArr3[i11].f26820c > eVar.f26820c) {
            int i13 = 0;
            while (true) {
                i = this.f26818h;
                if (i13 >= i) {
                    break;
                }
                this.f26817g[i13] = this.f26816f[i13];
                i13++;
            }
            Arrays.sort(this.f26817g, 0, i, new l(3));
            for (int i14 = 0; i14 < this.f26818h; i14++) {
                this.f26816f[i14] = this.f26817g[i14];
            }
        }
        eVar.f26819b = true;
        eVar.a(this);
    }

    public final void k(e eVar) {
        int i = 0;
        while (i < this.f26818h) {
            if (this.f26816f[i] == eVar) {
                while (true) {
                    int i10 = this.f26818h;
                    if (i >= i10 - 1) {
                        this.f26818h = i10 - 1;
                        eVar.f26819b = false;
                        return;
                    } else {
                        e[] eVarArr = this.f26816f;
                        int i11 = i + 1;
                        eVarArr[i] = eVarArr[i11];
                        i = i11;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // k1.b
    public final String toString() {
        h3.e eVar = this.i;
        String str = " goal -> (" + this.f26796b + ") : ";
        for (int i = 0; i < this.f26818h; i++) {
            eVar.f20375c = this.f26816f[i];
            str = str + eVar + " ";
        }
        return str;
    }
}
