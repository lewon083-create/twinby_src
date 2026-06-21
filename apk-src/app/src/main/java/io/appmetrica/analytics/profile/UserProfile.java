package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Cdo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25395a;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f25396a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends Cdo> userProfileUpdate) {
            this.f25396a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f25396a, 0);
        }

        private Builder() {
            this.f25396a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends Cdo>> getUserProfileUpdates() {
        return this.f25395a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f25395a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
