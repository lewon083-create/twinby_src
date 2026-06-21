package ui;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f34485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f34486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f34487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f34488d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, a aVar, Double d10) {
        this.f34485a = colorDrawable;
        this.f34486b = colorDrawable2;
        this.f34487c = aVar;
        this.f34488d = d10;
    }

    public final Float a() {
        Double d10 = this.f34488d;
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(d10.floatValue());
    }

    public final boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = cVar.f34486b;
        ColorDrawable colorDrawable3 = cVar.f34485a;
        ColorDrawable colorDrawable4 = this.f34485a;
        return ((colorDrawable4 == null && colorDrawable3 == null) || colorDrawable4.getColor() == colorDrawable3.getColor()) && (((colorDrawable = this.f34486b) == null && colorDrawable2 == null) || colorDrawable.getColor() == colorDrawable2.getColor()) && Objects.equals(this.f34488d, cVar.f34488d) && Objects.equals(this.f34487c, cVar.f34487c);
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f34485a;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.f34486b;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.f34488d, this.f34487c);
    }
}
