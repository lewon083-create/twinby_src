package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.C0023a8;
import io.appmetrica.analytics.impl.C0049b8;
import io.appmetrica.analytics.impl.C0500t4;
import io.appmetrica.analytics.impl.C0527u6;
import io.appmetrica.analytics.impl.C0617xl;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.K2;
import io.appmetrica.analytics.impl.Wk;
import io.appmetrica.analytics.impl.Xm;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0527u6 f25380a = new C0527u6("appmetrica_birth_date", new C0049b8(), new C0617xl());

    public final UserProfileUpdate a(Calendar calendar, String str, K2 k22) {
        return new UserProfileUpdate(new Xm(this.f25380a.f24837c, new SimpleDateFormat(str).format(calendar.getTime()), new C0023a8(), new C0049b8(), k22));
    }

    public UserProfileUpdate<? extends Cdo> withAge(int i) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C0500t4(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withAgeIfUndefined(int i) {
        int i10 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new Wk(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0500t4(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Wk(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withValueReset() {
        return new UserProfileUpdate<>(new Ai(0, this.f25380a.f24837c, new C0049b8(), new C0617xl()));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new C0500t4(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new Wk(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDate(int i, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0500t4(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDateIfUndefined(int i, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Wk(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDate(int i, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0500t4(this.f25380a.f24836b));
    }

    public UserProfileUpdate<? extends Cdo> withBirthDateIfUndefined(int i, int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i11);
        return a(gregorianCalendar, "yyyy-MM-dd", new Wk(this.f25380a.f24836b));
    }
}
