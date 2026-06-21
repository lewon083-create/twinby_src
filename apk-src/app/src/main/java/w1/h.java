package w1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f34982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f34983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34984c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f34982a = colorStateList;
        this.f34983b = configuration;
        this.f34984c = theme == null ? 0 : theme.hashCode();
    }
}
