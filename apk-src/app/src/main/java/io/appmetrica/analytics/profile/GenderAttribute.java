package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.C0023a8;
import io.appmetrica.analytics.impl.C0049b8;
import io.appmetrica.analytics.impl.C0500t4;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.C0617xl;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.Wk;
import io.appmetrica.analytics.impl.Xm;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25389a = new C0527u6("appmetrica_gender", new C0049b8(), new C0617xl());

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25391a;

        Gender(String str) {
            this.f25391a = str;
        }

        public String getStringValue() {
            return this.f25391a;
        }
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValue(@NonNull Gender gender) {
        String str = this.f25389a.f24837c;
        String stringValue = gender.getStringValue();
        C0023a8 c0023a8 = new C0023a8();
        C0527u6 c0527u6 = this.f25389a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c0023a8, c0527u6.f24835a, new C0500t4(c0527u6.f24836b)));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f25389a.f24837c;
        String stringValue = gender.getStringValue();
        C0023a8 c0023a8 = new C0023a8();
        C0527u6 c0527u6 = this.f25389a;
        return new UserProfileUpdate<>(new Xm(str, stringValue, c0023a8, c0527u6.f24835a, new Wk(c0527u6.f24836b)));
    }

    @NonNull
    public UserProfileUpdate<? extends Cdo> withValueReset() {
        C0527u6 c0527u6 = this.f25389a;
        return new UserProfileUpdate<>(new Ai(0, c0527u6.f24837c, c0527u6.f24835a, c0527u6.f24836b));
    }
}
