package z3;

import com.google.android.gms.internal.measurement.h5;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f46041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46042d;

    public d(String str, double d10) {
        this.f46039a = str;
        this.f46040b = 2;
        this.f46041c = d10;
        this.f46042d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f46040b == dVar.f46040b && Double.compare(this.f46041c, dVar.f46041c) == 0 && Objects.equals(this.f46039a, dVar.f46039a) && Objects.equals(this.f46042d, dVar.f46042d);
    }

    public final int hashCode() {
        return Objects.hash(this.f46039a, Integer.valueOf(this.f46040b), Double.valueOf(this.f46041c), this.f46042d);
    }

    public d(String str, String str2, int i) {
        boolean z5 = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z5 = false;
        }
        h5.r(z5);
        this.f46039a = str;
        this.f46040b = i;
        this.f46042d = str2;
        this.f46041c = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }
}
