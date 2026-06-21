package k1;

import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb.e f26788c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26786a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26789d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f26790e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f26791f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f26792g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26793h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26794j = false;

    public a(b bVar, bb.e eVar) {
        this.f26787b = bVar;
        this.f26788c = eVar;
    }

    public final void a(e eVar, float f10, boolean z5) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i = this.f26793h;
            b bVar = this.f26787b;
            if (i == -1) {
                this.f26793h = 0;
                this.f26792g[0] = f10;
                this.f26790e[0] = eVar.f26820c;
                this.f26791f[0] = -1;
                eVar.f26828l++;
                eVar.a(bVar);
                this.f26786a++;
                if (this.f26794j) {
                    return;
                }
                int i10 = this.i + 1;
                this.i = i10;
                int[] iArr = this.f26790e;
                if (i10 >= iArr.length) {
                    this.f26794j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i != -1 && i12 < this.f26786a; i12++) {
                int i13 = this.f26790e[i];
                int i14 = eVar.f26820c;
                if (i13 == i14) {
                    float[] fArr = this.f26792g;
                    float f11 = fArr[i] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i] = f11;
                    if (f11 == 0.0f) {
                        if (i == this.f26793h) {
                            this.f26793h = this.f26791f[i];
                        } else {
                            int[] iArr2 = this.f26791f;
                            iArr2[i11] = iArr2[i];
                        }
                        if (z5) {
                            eVar.b(bVar);
                        }
                        if (this.f26794j) {
                            this.i = i;
                        }
                        eVar.f26828l--;
                        this.f26786a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i;
                }
                i = this.f26791f[i];
            }
            int length = this.i;
            int i15 = length + 1;
            if (this.f26794j) {
                int[] iArr3 = this.f26790e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f26790e;
            if (length >= iArr4.length && this.f26786a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f26790e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f26790e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f26789d * 2;
                this.f26789d = i17;
                this.f26794j = false;
                this.i = length - 1;
                this.f26792g = Arrays.copyOf(this.f26792g, i17);
                this.f26790e = Arrays.copyOf(this.f26790e, this.f26789d);
                this.f26791f = Arrays.copyOf(this.f26791f, this.f26789d);
            }
            this.f26790e[length] = eVar.f26820c;
            this.f26792g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f26791f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f26791f[length] = this.f26793h;
                this.f26793h = length;
            }
            eVar.f26828l++;
            eVar.a(bVar);
            this.f26786a++;
            if (!this.f26794j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.f26790e;
            if (i18 >= iArr8.length) {
                this.f26794j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f26793h;
        for (int i10 = 0; i != -1 && i10 < this.f26786a; i10++) {
            e eVar = ((e[]) this.f26788c.f2021e)[this.f26790e[i]];
            if (eVar != null) {
                eVar.b(this.f26787b);
            }
            i = this.f26791f[i];
        }
        this.f26793h = -1;
        this.i = -1;
        this.f26794j = false;
        this.f26786a = 0;
    }

    public final float c(e eVar) {
        int i = this.f26793h;
        for (int i10 = 0; i != -1 && i10 < this.f26786a; i10++) {
            if (this.f26790e[i] == eVar.f26820c) {
                return this.f26792g[i];
            }
            i = this.f26791f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f26786a;
    }

    public final e e(int i) {
        int i10 = this.f26793h;
        for (int i11 = 0; i10 != -1 && i11 < this.f26786a; i11++) {
            if (i11 == i) {
                return ((e[]) this.f26788c.f2021e)[this.f26790e[i10]];
            }
            i10 = this.f26791f[i10];
        }
        return null;
    }

    public final float f(int i) {
        int i10 = this.f26793h;
        for (int i11 = 0; i10 != -1 && i11 < this.f26786a; i11++) {
            if (i11 == i) {
                return this.f26792g[i10];
            }
            i10 = this.f26791f[i10];
        }
        return 0.0f;
    }

    public final void g(e eVar, float f10) {
        if (f10 == 0.0f) {
            h(eVar, true);
            return;
        }
        int i = this.f26793h;
        b bVar = this.f26787b;
        if (i == -1) {
            this.f26793h = 0;
            this.f26792g[0] = f10;
            this.f26790e[0] = eVar.f26820c;
            this.f26791f[0] = -1;
            eVar.f26828l++;
            eVar.a(bVar);
            this.f26786a++;
            if (this.f26794j) {
                return;
            }
            int i10 = this.i + 1;
            this.i = i10;
            int[] iArr = this.f26790e;
            if (i10 >= iArr.length) {
                this.f26794j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i != -1 && i12 < this.f26786a; i12++) {
            int i13 = this.f26790e[i];
            int i14 = eVar.f26820c;
            if (i13 == i14) {
                this.f26792g[i] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i;
            }
            i = this.f26791f[i];
        }
        int length = this.i;
        int i15 = length + 1;
        if (this.f26794j) {
            int[] iArr2 = this.f26790e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f26790e;
        if (length >= iArr3.length && this.f26786a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f26790e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f26790e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f26789d * 2;
            this.f26789d = i17;
            this.f26794j = false;
            this.i = length - 1;
            this.f26792g = Arrays.copyOf(this.f26792g, i17);
            this.f26790e = Arrays.copyOf(this.f26790e, this.f26789d);
            this.f26791f = Arrays.copyOf(this.f26791f, this.f26789d);
        }
        this.f26790e[length] = eVar.f26820c;
        this.f26792g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f26791f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f26791f[length] = this.f26793h;
            this.f26793h = length;
        }
        eVar.f26828l++;
        eVar.a(bVar);
        int i18 = this.f26786a + 1;
        this.f26786a = i18;
        if (!this.f26794j) {
            this.i++;
        }
        int[] iArr7 = this.f26790e;
        if (i18 >= iArr7.length) {
            this.f26794j = true;
        }
        if (this.i >= iArr7.length) {
            this.f26794j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(e eVar, boolean z5) {
        int i = this.f26793h;
        if (i == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i != -1 && i10 < this.f26786a) {
            if (this.f26790e[i] == eVar.f26820c) {
                if (i == this.f26793h) {
                    this.f26793h = this.f26791f[i];
                } else {
                    int[] iArr = this.f26791f;
                    iArr[i11] = iArr[i];
                }
                if (z5) {
                    eVar.b(this.f26787b);
                }
                eVar.f26828l--;
                this.f26786a--;
                this.f26790e[i] = -1;
                if (this.f26794j) {
                    this.i = i;
                }
                return this.f26792g[i];
            }
            i10++;
            i11 = i;
            i = this.f26791f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f26793h;
        String string = "";
        for (int i10 = 0; i != -1 && i10 < this.f26786a; i10++) {
            StringBuilder sbJ = pe.a.j(om1.x(string, " -> "));
            sbJ.append(this.f26792g[i]);
            sbJ.append(" : ");
            StringBuilder sbJ2 = pe.a.j(sbJ.toString());
            sbJ2.append(((e[]) this.f26788c.f2021e)[this.f26790e[i]]);
            string = sbJ2.toString();
            i = this.f26791f[i];
        }
        return string;
    }
}
