package a7;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f487b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f488a;

    public j(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f488a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (p.f500g.b()) {
            return this.f488a.deleteProfile(str);
        }
        throw p.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (p.f500g.b()) {
            return this.f488a.getAllProfileNames();
        }
        throw p.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final z6.a getOrCreateProfile(String str) {
        if (!p.f500g.b()) {
            throw p.a();
        }
        return new l(3, (ProfileBoundaryInterface) rl.b.c(ProfileBoundaryInterface.class, this.f488a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final z6.a getProfile(String str) {
        if (!p.f500g.b()) {
            throw p.a();
        }
        InvocationHandler profile = this.f488a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new l(3, (ProfileBoundaryInterface) rl.b.c(ProfileBoundaryInterface.class, profile));
    }
}
