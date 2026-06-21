package g0;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f19562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19563c;

    public g(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f19561a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f19562b = cls;
        this.f19563c = key;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            Object obj3 = gVar.f19563c;
            if (this.f19561a.equals(gVar.f19561a) && this.f19562b.equals(gVar.f19562b) && ((obj2 = this.f19563c) != null ? obj2.equals(obj3) : obj3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f19561a.hashCode() ^ 1000003) * 1000003) ^ this.f19562b.hashCode()) * 1000003;
        Object obj = this.f19563c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f19561a + ", valueClass=" + this.f19562b + ", token=" + this.f19563c + "}";
    }
}
