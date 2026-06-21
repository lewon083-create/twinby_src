package t1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f33389c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static t f33392f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f33393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f33388b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashSet f33390d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f33391e = new Object();

    public u(Context context) {
        this.f33393a = (NotificationManager) context.getSystemService("notification");
    }
}
