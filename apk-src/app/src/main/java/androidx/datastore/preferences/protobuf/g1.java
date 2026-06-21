package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.ap1;
import com.google.android.gms.internal.consent_sdk.r6;
import com.google.android.gms.internal.measurement.o6;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f1403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f1404f;

    public /* synthetic */ g1(ap1 ap1Var) {
        this.f1400b = 1;
        Objects.requireNonNull(ap1Var);
        this.f1404f = ap1Var;
        this.f1401c = -1;
    }

    public Iterator a() {
        if (this.f1403e == null) {
            this.f1403e = ((e1) this.f1404f).f1380c.entrySet().iterator();
        }
        return this.f1403e;
    }

    public Iterator b() {
        switch (this.f1400b) {
            case 1:
                if (this.f1403e == null) {
                    this.f1403e = ((ap1) this.f1404f).f3353d.entrySet().iterator();
                }
                break;
            case 2:
                if (this.f1403e == null) {
                    this.f1403e = ((r6) this.f1404f).f13541d.entrySet().iterator();
                }
                break;
            default:
                if (this.f1403e == null) {
                    this.f1403e = ((o6) this.f1404f).f13905d.entrySet().iterator();
                }
                break;
        }
        return this.f1403e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1400b) {
            case 0:
                int i = this.f1401c + 1;
                e1 e1Var = (e1) this.f1404f;
                if (i >= e1Var.f1379b.size()) {
                    if (e1Var.f1380c.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            case 1:
                int i10 = this.f1401c + 1;
                ap1 ap1Var = (ap1) this.f1404f;
                if (i10 >= ap1Var.f3352c) {
                    if (ap1Var.f3353d.isEmpty() || !b().hasNext()) {
                    }
                }
                break;
            case 2:
                int i11 = this.f1401c + 1;
                r6 r6Var = (r6) this.f1404f;
                if (i11 >= r6Var.f13540c) {
                    if (r6Var.f13541d.isEmpty() || !b().hasNext()) {
                    }
                }
                break;
            default:
                int i12 = this.f1401c + 1;
                o6 o6Var = (o6) this.f1404f;
                if (i12 >= o6Var.f13904c) {
                    if (o6Var.f13905d.isEmpty() || !b().hasNext()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1400b) {
            case 0:
                this.f1402d = true;
                int i = this.f1401c + 1;
                this.f1401c = i;
                e1 e1Var = (e1) this.f1404f;
                if (i >= e1Var.f1379b.size()) {
                }
                break;
            case 1:
                this.f1402d = true;
                int i10 = this.f1401c + 1;
                this.f1401c = i10;
                ap1 ap1Var = (ap1) this.f1404f;
                if (i10 >= ap1Var.f3352c) {
                }
                break;
            case 2:
                this.f1402d = true;
                int i11 = this.f1401c + 1;
                this.f1401c = i11;
                r6 r6Var = (r6) this.f1404f;
                if (i11 >= r6Var.f13540c) {
                }
                break;
            default:
                this.f1402d = true;
                int i12 = this.f1401c + 1;
                this.f1401c = i12;
                o6 o6Var = (o6) this.f1404f;
                if (i12 >= o6Var.f13904c) {
                }
                break;
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1400b;
        AbstractMap abstractMap = this.f1404f;
        switch (i) {
            case 0:
                e1 e1Var = (e1) abstractMap;
                if (!this.f1402d) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1402d = false;
                int i10 = e1.f1378g;
                e1Var.b();
                if (this.f1401c >= e1Var.f1379b.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f1401c;
                this.f1401c = i11 - 1;
                e1Var.h(i11);
                return;
            case 1:
                if (!this.f1402d) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1402d = false;
                ap1 ap1Var = (ap1) abstractMap;
                ap1Var.f();
                int i12 = this.f1401c;
                if (i12 >= ap1Var.f3352c) {
                    b().remove();
                    return;
                } else {
                    this.f1401c = i12 - 1;
                    ap1Var.d(i12);
                    return;
                }
            case 2:
                if (!this.f1402d) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1402d = false;
                r6 r6Var = (r6) abstractMap;
                int i13 = r6.f13538h;
                r6Var.g();
                int i14 = this.f1401c;
                if (i14 >= r6Var.f13540c) {
                    b().remove();
                    return;
                } else {
                    this.f1401c = i14 - 1;
                    r6Var.e(i14);
                    return;
                }
            default:
                if (!this.f1402d) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1402d = false;
                o6 o6Var = (o6) abstractMap;
                o6Var.f();
                int i15 = this.f1401c;
                if (i15 >= o6Var.f13904c) {
                    b().remove();
                    return;
                } else {
                    this.f1401c = i15 - 1;
                    o6Var.d(i15);
                    return;
                }
        }
    }

    public /* synthetic */ g1(r6 r6Var) {
        this.f1400b = 2;
        Objects.requireNonNull(r6Var);
        this.f1404f = r6Var;
        this.f1401c = -1;
    }

    public /* synthetic */ g1(o6 o6Var) {
        this.f1400b = 3;
        Objects.requireNonNull(o6Var);
        this.f1404f = o6Var;
        this.f1401c = -1;
    }

    public g1(e1 e1Var) {
        this.f1400b = 0;
        this.f1404f = e1Var;
        this.f1401c = -1;
    }
}
