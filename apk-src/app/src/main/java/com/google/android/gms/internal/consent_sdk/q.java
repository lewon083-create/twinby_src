package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.internal.ads.zz;
import io.sentry.protocol.App;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zz f13520c;

    public /* synthetic */ q(zz zzVar, int i) {
        this.f13519b = i;
        this.f13520c = zzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13519b) {
            case 0:
                zz zzVar = this.f13520c;
                zzVar.getClass();
                ((Executor) zzVar.f13154e).execute(new q(zzVar, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                zz zzVar2 = this.f13520c;
                Application application = (Application) zzVar2.f13151b;
                try {
                    jSONObject.put(App.JsonKeys.APP_NAME, application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String strConcat = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    g gVar = (g) zzVar2.i;
                    for (String str : gVar.a().keySet()) {
                        jSONObject2.put(str, gVar.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                    break;
                } catch (JSONException unused) {
                }
                ((k) zzVar2.f13157h).f13437h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
