package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.consent_sdk.k5;
import com.google.android.gms.internal.measurement.z4;
import com.google.android.gms.internal.play_billing.w2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1373b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1374c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1376e;

    public e(com.google.android.gms.internal.auth.g0 g0Var) {
        this.f1376e = g0Var;
        this.f1375d = g0Var.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1373b) {
            case 0:
                if (this.f1374c < this.f1375d) {
                }
                break;
            case 1:
                if (this.f1374c < this.f1375d) {
                }
                break;
            case 2:
                if (this.f1374c < this.f1375d) {
                }
                break;
            case 3:
                if (this.f1374c < this.f1375d) {
                }
                break;
            default:
                if (this.f1374c < this.f1375d) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1373b) {
            case 0:
                int i = this.f1374c;
                if (i >= this.f1375d) {
                    throw new NoSuchElementException();
                }
                this.f1374c = i + 1;
                return Byte.valueOf(((h) this.f1376e).n(i));
            case 1:
                int i10 = this.f1374c;
                if (i10 >= this.f1375d) {
                    throw new NoSuchElementException();
                }
                this.f1374c = i10 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.auth.g0) this.f1376e).c(i10));
            case 2:
                int i11 = this.f1374c;
                if (i11 >= this.f1375d) {
                    throw new NoSuchElementException();
                }
                this.f1374c = i11 + 1;
                return Byte.valueOf(((k5) this.f1376e).c(i11));
            case 3:
                int i12 = this.f1374c;
                if (i12 >= this.f1375d) {
                    throw new NoSuchElementException();
                }
                this.f1374c = i12 + 1;
                return Byte.valueOf(((z4) this.f1376e).c(i12));
            default:
                int i13 = this.f1374c;
                if (i13 >= this.f1375d) {
                    throw new NoSuchElementException();
                }
                this.f1374c = i13 + 1;
                return Byte.valueOf(((w2) this.f1376e).c(i13));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1373b) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public e(k5 k5Var) {
        this.f1376e = k5Var;
        this.f1375d = k5Var.e();
    }

    public e(z4 z4Var) {
        this.f1376e = z4Var;
        this.f1375d = z4Var.e();
    }

    public e(w2 w2Var) {
        this.f1376e = w2Var;
        this.f1375d = w2Var.e();
    }

    public e(h hVar) {
        this.f1376e = hVar;
        this.f1375d = hVar.size();
    }
}
