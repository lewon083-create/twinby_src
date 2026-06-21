package ui;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f34479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f34480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f34481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f34483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f34484f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f34479a = dVar;
        this.f34480b = colorDrawable;
        this.f34481c = cVar;
        this.f34482d = cVar2;
        this.f34483e = cVar3;
        this.f34484f = cVar4;
    }

    public final boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        ColorDrawable colorDrawable2 = bVar.f34480b;
        return this.f34479a == bVar.f34479a && (((colorDrawable = this.f34480b) == null && colorDrawable2 == null) || colorDrawable.getColor() == colorDrawable2.getColor()) && Objects.equals(this.f34481c, bVar.f34481c) && Objects.equals(this.f34482d, bVar.f34482d) && Objects.equals(this.f34483e, bVar.f34483e) && Objects.equals(this.f34484f, bVar.f34484f);
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f34480b;
        return Objects.hash(colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.f34481c, this.f34482d, this.f34483e, this.f34484f);
    }
}
