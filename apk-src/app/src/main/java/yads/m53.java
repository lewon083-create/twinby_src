package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m53 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f40805c = new HashSet(kotlin.collections.r.c("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f40806d = new HashSet(kotlin.collections.s.f("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f40807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic2 f40808b;

    public /* synthetic */ m53(Context context, LocationManager locationManager) {
        this(locationManager, new ic2(context));
    }

    public m53(LocationManager locationManager, ic2 ic2Var) {
        this.f40807a = locationManager;
        this.f40808b = ic2Var;
    }
}
