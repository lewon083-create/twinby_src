package bi;

import a0.b1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.google.android.gms.internal.measurement.j4;
import f9.g;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, int i) {
        super(3, gVar);
        this.f2152d = i;
    }

    @Override // a0.b1
    public final Bitmap q(ByteBuffer byteBuffer, d dVar) {
        switch (this.f2152d) {
            case 0:
                Bitmap bitmapQ = super.q(byteBuffer, dVar);
                if (bitmapQ != null) {
                    return bitmapQ;
                }
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
                if (dVar.f2157d == 0) {
                    return j4.b(bitmapDecodeByteArray, dVar.f2158e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f2157d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                bitmapDecodeByteArray.recycle();
                return j4.b(bitmapCreateBitmap, dVar.f2158e);
            default:
                return j4.b(super.q(byteBuffer, dVar), dVar.f2158e);
        }
    }
}
