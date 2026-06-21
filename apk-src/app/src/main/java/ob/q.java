package ob;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f30353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30354e;

    @Override // ob.s1
    public final boolean D() {
        Calendar calendar = Calendar.getInstance();
        this.f30353d = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f30354e = t.z.g(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long G() {
        E();
        return this.f30353d;
    }

    public final String H() {
        E();
        return this.f30354e;
    }
}
