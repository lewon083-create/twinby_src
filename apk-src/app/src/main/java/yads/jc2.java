package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f39825a = kotlin.collections.s.f("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            ArrayList arrayListT = CollectionsKt.T(f39825a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                arrayListT.removeAll(kotlin.collections.p.v(strArr));
                if (arrayListT.isEmpty()) {
                    return;
                }
                String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{arrayListT}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                throw new wb1(str, str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
