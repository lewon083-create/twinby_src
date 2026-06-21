package h1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20319f;

    public a(int i) {
        this.f20315b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20316c < this.f20315b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f20316c;
        switch (this.f20318e) {
            case 0:
                objF = ((e) this.f20319f).f(i);
                break;
            case 1:
                objF = ((e) this.f20319f).i(i);
                break;
            default:
                objF = ((f) this.f20319f).f20330c[i];
                break;
        }
        this.f20316c++;
        this.f20317d = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20317d) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f20316c - 1;
        this.f20316c = i;
        switch (this.f20318e) {
            case 0:
                ((e) this.f20319f).g(i);
                break;
            case 1:
                ((e) this.f20319f).g(i);
                break;
            default:
                ((f) this.f20319f).a(i);
                break;
        }
        this.f20315b--;
        this.f20317d = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f20331d);
        this.f20318e = 2;
        this.f20319f = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f20340d);
        this.f20318e = i;
        switch (i) {
            case 1:
                this.f20319f = eVar;
                this(eVar.f20340d);
                break;
            default:
                this.f20319f = eVar;
                break;
        }
    }
}
