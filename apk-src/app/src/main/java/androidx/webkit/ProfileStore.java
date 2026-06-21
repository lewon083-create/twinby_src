package androidx.webkit;

import a7.j;
import a7.p;
import a7.r;
import java.util.List;
import z6.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!p.f500g.b()) {
            throw p.a();
        }
        if (j.f487b == null) {
            j.f487b = new j(r.f504a.getProfileStore());
        }
        return j.f487b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    a getOrCreateProfile(String str);

    a getProfile(String str);
}
