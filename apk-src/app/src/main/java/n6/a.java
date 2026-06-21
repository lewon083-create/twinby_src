package n6;

import a0.u;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29144g;

    public a(int i, String str, String str2, String str3, boolean z5, int i10) {
        this.f29138a = str;
        this.f29139b = str2;
        this.f29141d = z5;
        this.f29142e = i;
        int i11 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i11 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i11 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i11 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f29140c = i11;
        this.f29143f = str3;
        this.f29144g = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i = aVar.f29144g;
            String str = aVar.f29143f;
            if (this.f29142e != aVar.f29142e || !this.f29138a.equals(aVar.f29138a) || this.f29141d != aVar.f29141d) {
                return false;
            }
            String str2 = this.f29143f;
            int i10 = this.f29144g;
            if (i10 == 1 && i == 2 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i10 == 2 && i == 1 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i) {
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f29140c != aVar.f29140c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f29138a.hashCode() * 31) + this.f29140c) * 31) + (this.f29141d ? 1231 : 1237)) * 31) + this.f29142e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f29138a);
        sb2.append("', type='");
        sb2.append(this.f29139b);
        sb2.append("', affinity='");
        sb2.append(this.f29140c);
        sb2.append("', notNull=");
        sb2.append(this.f29141d);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f29142e);
        sb2.append(", defaultValue='");
        return u.o(sb2, this.f29143f, "'}");
    }
}
