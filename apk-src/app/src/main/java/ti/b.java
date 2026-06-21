package ti;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements xc.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f33798b;

    public /* synthetic */ b(Context context) {
        this.f33798b = context;
    }

    @Override // xc.h
    public Object a() {
        return this.f33798b;
    }

    public y8.k b() {
        Context context = this.f33798b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        y8.k kVar = new y8.k();
        kVar.f36555b = a9.a.a(y8.n.f36563a);
        a9.c cVar = new a9.c(0, context);
        kVar.f36556c = cVar;
        kVar.f36557d = a9.a.a(new f9.k(cVar, new a9.c(1, cVar), 1));
        a9.c cVar2 = kVar.f36556c;
        kVar.f36558e = new f9.e(cVar2, 1);
        hj.a aVarA = a9.a.a(new f9.k(kVar.f36558e, a9.a.a(new f9.e(cVar2, 0)), 0));
        kVar.f36559f = aVarA;
        d9.d dVar = new d9.d(0);
        a9.c cVar3 = kVar.f36556c;
        d9.e eVar = new d9.e(cVar3, aVarA, dVar, 0);
        hj.a aVar = kVar.f36555b;
        hj.a aVar2 = kVar.f36557d;
        kVar.f36560g = a9.a.a(new d9.e(new d9.b(aVar, aVar2, eVar, aVarA, aVarA), new e9.h(cVar3, aVar2, aVarA, eVar, aVar, aVarA, aVarA), new e9.i(aVar, aVarA, eVar, aVarA), 1));
        return kVar;
    }

    public ApplicationInfo c(int i, String str) {
        return this.f33798b.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo d(int i, String str) {
        return this.f33798b.getPackageManager().getPackageInfo(str, i);
    }

    public boolean e() {
        String nameForUid;
        Context context = this.f33798b;
        if (Binder.getCallingUid() == Process.myUid()) {
            return wa.a.s(context);
        }
        if (!ua.b.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 int, still in use, count: 2, list:
          (r8v2 int) from 0x0034: IF  (r8v2 int) < (100 int)  -> B:70:0x0039 A[HIDDEN] (LINE:53)
          (r8v2 int) from 0x0039: PHI (r8v1 int) = (r8v2 int) binds: [B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:126)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.String f(java.lang.String r20, java.lang.Double r21, java.lang.Double r22, int r23) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.f(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File g(Bitmap bitmap, Double d10, Double d11, int i, String str) throws IOException {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, d10.intValue(), d11.intValue(), false);
        String strK = om1.k("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmapCreateScaledBitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmapCreateScaledBitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        File file = new File(this.f33798b.getCacheDir(), strK);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }
}
