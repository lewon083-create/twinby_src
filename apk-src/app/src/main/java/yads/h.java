package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38955b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38956c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA;
        int i = this.f38955b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iA2 = hg0.a(i);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 != 2) {
            this.f38955b = 4;
            x23 x23Var = (x23) this;
            int i10 = x23Var.f44578g;
            while (true) {
                int i11 = x23Var.f44578g;
                if (i11 == -1) {
                    x23Var.f38955b = 3;
                    string = null;
                    break;
                }
                iA = x23Var.i.f44895a.a(x23Var.f44575d, i11);
                if (iA == -1) {
                    iA = x23Var.f44575d.length();
                    x23Var.f44578g = -1;
                } else {
                    x23Var.f44578g = iA + 1;
                }
                int i12 = x23Var.f44578g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    x23Var.f44578g = i13;
                    if (i13 > x23Var.f44575d.length()) {
                        x23Var.f44578g = -1;
                    }
                } else {
                    while (i10 < iA && x23Var.f44576e.a(x23Var.f44575d.charAt(i10))) {
                        i10++;
                    }
                    while (iA > i10 && x23Var.f44576e.a(x23Var.f44575d.charAt(iA - 1))) {
                        iA--;
                    }
                    if (!x23Var.f44577f || i10 != iA) {
                        break;
                    }
                    i10 = x23Var.f44578g;
                }
            }
            int i14 = x23Var.f44579h;
            if (i14 == 1) {
                iA = x23Var.f44575d.length();
                x23Var.f44578g = -1;
                while (iA > i10 && x23Var.f44576e.a(x23Var.f44575d.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                x23Var.f44579h = i14 - 1;
            }
            string = x23Var.f44575d.subSequence(i10, iA).toString();
            this.f38956c = string;
            if (this.f38955b != 3) {
                this.f38955b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f38955b = 2;
        String str = this.f38956c;
        this.f38956c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
