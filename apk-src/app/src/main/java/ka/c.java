package ka;

import ad.m0;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import na.o;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f27304d = new m0("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f27306c;

    public c(String str) {
        c0.f(str);
        this.f27305b = str;
        this.f27306c = new o(null, 1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var = f27304d;
        Status status = Status.f2631h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f27305b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2629f;
            } else {
                Log.e((String) m0Var.f840d, m0Var.i("Unable to revoke access!", new Object[0]));
            }
            m0Var.h("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e3) {
            Log.e((String) m0Var.f840d, m0Var.i("IOException when revoking access: ".concat(String.valueOf(e3.toString())), new Object[0]));
        } catch (Exception e7) {
            Log.e((String) m0Var.f840d, m0Var.i("Exception when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]));
        }
        this.f27306c.G(status);
    }
}
