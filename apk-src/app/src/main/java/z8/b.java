package z8;

import a0.u;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f46205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.a f46206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46207d;

    public b(Context context, h9.a aVar, h9.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f46204a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f46205b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f46206c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f46207d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f46204a.equals(bVar.f46204a) && this.f46205b.equals(bVar.f46205b) && this.f46206c.equals(bVar.f46206c) && this.f46207d.equals(bVar.f46207d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f46204a.hashCode() ^ 1000003) * 1000003) ^ this.f46205b.hashCode()) * 1000003) ^ this.f46206c.hashCode()) * 1000003) ^ this.f46207d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f46204a);
        sb2.append(", wallClock=");
        sb2.append(this.f46205b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f46206c);
        sb2.append(", backendName=");
        return u.o(sb2, this.f46207d, "}");
    }
}
