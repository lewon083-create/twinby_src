package a7;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f480c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f482b;

    public c(String str, String str2) {
        this.f481a = str;
        this.f482b = str2;
        f480c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f478a;
        String str = this.f482b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
