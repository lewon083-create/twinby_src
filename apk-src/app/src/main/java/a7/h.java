package a7;

import android.view.WindowManager;
import io.appmetrica.analytics.impl.C0621y0;
import io.appmetrica.analytics.impl.U;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import yads.vs2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f485c;

    public /* synthetic */ h(int i, Object obj) {
        this.f484b = i;
        this.f485c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        he.d dVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        switch (this.f484b) {
            case 0:
                return new i((JsReplyProxyBoundaryInterface) this.f485c);
            case 1:
                return ((ge.e) this.f485c).c();
            case 2:
                return ((ge.l) this.f485c).c();
            case 3:
                he.n nVar = (he.n) this.f485c;
                synchronized (nVar) {
                    dVarA = null;
                    try {
                        fileInputStreamOpenFileInput = nVar.f20553a.openFileInput(nVar.f20554b);
                        try {
                            int iAvailable = fileInputStreamOpenFileInput.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                            dVarA = he.d.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStreamOpenFileInput.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th4) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th4;
                    }
                }
                return dVarA;
            case 4:
                return U.e((U) this.f485c);
            case 5:
                return ((C0621y0) this.f485c).p();
            default:
                return vs2.a((WindowManager) this.f485c);
        }
    }
}
