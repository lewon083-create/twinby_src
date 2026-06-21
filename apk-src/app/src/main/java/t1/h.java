package t1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f33344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f33345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f33349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f33350g;

    public h(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131165318);
        Bundle bundle = new Bundle();
        this.f33347d = true;
        this.f33345b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.f33348e = iconCompatB.c();
        }
        this.f33349f = l.b(str);
        this.f33350g = pendingIntent;
        this.f33344a = bundle;
        this.f33346c = true;
        this.f33347d = true;
    }
}
