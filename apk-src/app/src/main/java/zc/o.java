package zc;

import ad.m0;
import com.google.android.gms.internal.measurement.h5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f46230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f46231e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f46234h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46228b = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46232f = 0;

    public o(m0 m0Var, CharSequence charSequence, c cVar) {
        this.f46234h = cVar;
        this.f46231e = (b) m0Var.f840d;
        this.f46233g = m0Var.f839c;
        this.f46230d = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        b bVar;
        h5.r(this.f46228b != 4);
        int iM = z.m(this.f46228b);
        if (iM == 0) {
            return true;
        }
        if (iM != 2) {
            this.f46228b = 4;
            int i = this.f46232f;
            while (true) {
                int length = this.f46232f;
                if (length == -1) {
                    this.f46228b = 3;
                    string = null;
                    break;
                }
                CharSequence charSequence = this.f46230d;
                int length2 = charSequence.length();
                h5.o(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (this.f46234h.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.f46232f = -1;
                } else {
                    this.f46232f = length + 1;
                }
                int i10 = this.f46232f;
                if (i10 == i) {
                    int i11 = i10 + 1;
                    this.f46232f = i11;
                    if (i11 > charSequence.length()) {
                        this.f46232f = -1;
                    }
                } else {
                    while (true) {
                        bVar = this.f46231e;
                        if (i >= length || !bVar.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && bVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i12 = this.f46233g;
                    if (i12 == 1) {
                        length = charSequence.length();
                        this.f46232f = -1;
                        while (length > i && bVar.a(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f46233g = i12 - 1;
                    }
                    string = charSequence.subSequence(i, length).toString();
                }
            }
            this.f46229c = string;
            if (this.f46228b != 3) {
                this.f46228b = 1;
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
        this.f46228b = 2;
        String str = this.f46229c;
        this.f46229c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
