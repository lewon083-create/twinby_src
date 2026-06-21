package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Cdo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class UserProfileUpdate<T extends Cdo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cdo f25397a;

    public UserProfileUpdate(Cdo cdo) {
        this.f25397a = cdo;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f25397a;
    }
}
