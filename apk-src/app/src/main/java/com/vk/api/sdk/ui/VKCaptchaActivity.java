package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.vk.api.sdk.R;
import com.vk.api.sdk.VKScheduler;
import com.vk.api.sdk.utils.VKLoader;
import com.vk.api.sdk.utils.VKUtils;
import com.vk.api.sdk.utils.VKValidationLocker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKCaptchaActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_URL = "key_url";
    private static String lastKey;
    private ImageView image;
    private EditText input;
    private ProgressBar progress;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: start$lambda-0, reason: not valid java name */
        public static final void m28start$lambda0(Context context, String img) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(img, "$img");
            Intent intentPutExtra = new Intent(context, (Class<?>) VKCaptchaActivity.class).addFlags(268435456).putExtra(VKCaptchaActivity.KEY_URL, img);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(context, VKCaptch…  .putExtra(KEY_URL, img)");
            context.startActivity(intentPutExtra);
        }

        public final String getLastKey() {
            return VKCaptchaActivity.lastKey;
        }

        public final void setLastKey(String str) {
            VKCaptchaActivity.lastKey = str;
        }

        public final void start(Context context, String img) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(img, "img");
            VKScheduler.runOnMainThread$default(new c(context, img, 0), 0L, 2, null);
        }

        private Companion() {
        }
    }

    private final void captchaCancelled() {
        lastKey = null;
        VKValidationLocker.INSTANCE.signal();
        setResult(0);
        finish();
    }

    private final void captchaDone() {
        EditText editText = this.input;
        if (editText == null) {
            Intrinsics.g("input");
            throw null;
        }
        lastKey = editText.getText().toString();
        VKValidationLocker.INSTANCE.signal();
        finish();
    }

    private final void displayImage(Bitmap bitmap) {
        VKScheduler.runOnMainThread$default(new a0.d(19, this, bitmap), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-5, reason: not valid java name */
    public static final void m23displayImage$lambda5(VKCaptchaActivity this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        ImageView imageView = this$0.image;
        if (imageView == null) {
            Intrinsics.g("image");
            throw null;
        }
        imageView.setImageBitmap(bitmap);
        ProgressBar progressBar = this$0.progress;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            Intrinsics.g("progress");
            throw null;
        }
    }

    private final void loadImage() {
        String stringExtra = getIntent().getStringExtra(KEY_URL);
        if (stringExtra == null) {
            return;
        }
        VKScheduler.INSTANCE.getNetworkExecutor().submit(new a0.d(20, stringExtra, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImage$lambda-4, reason: not valid java name */
    public static final void m24loadImage$lambda4(String url, VKCaptchaActivity this$0) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        byte[] bArrLoad = VKLoader.INSTANCE.load(url);
        if (bArrLoad == null) {
            return;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLoad, 0, bArrLoad.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(data, 0, data.size)");
        this$0.displayImage(bitmapDecodeByteArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m25onCreate$lambda0(VKCaptchaActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.captchaDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m26onCreate$lambda1(VKCaptchaActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.captchaCancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m27onCreate$lambda2(VKCaptchaActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.captchaCancelled();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        VKUtils vKUtils = VKUtils.INSTANCE;
        int iDp = vKUtils.dp(12);
        int iMax = (int) (Math.max(1.0f, vKUtils.density()) * 130.0f);
        int iMax2 = (int) (Math.max(1.0f, vKUtils.density()) * 50.0f);
        linearLayout.setPadding(iDp, iDp, iDp, iDp);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax2);
        layoutParams.bottomMargin = iDp;
        frameLayout.setLayoutParams(layoutParams);
        this.progress = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            Intrinsics.g("progress");
            throw null;
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.progress;
        if (progressBar2 == null) {
            Intrinsics.g("progress");
            throw null;
        }
        frameLayout.addView(progressBar2);
        this.image = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.image;
        if (imageView == null) {
            Intrinsics.g("image");
            throw null;
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.image;
        if (imageView2 == null) {
            Intrinsics.g("image");
            throw null;
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.input = editText;
        editText.setInputType(176);
        EditText editText2 = this.input;
        if (editText2 == null) {
            Intrinsics.g("input");
            throw null;
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMax, -2);
        EditText editText3 = this.input;
        if (editText3 == null) {
            Intrinsics.g("input");
            throw null;
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.input;
        if (view == null) {
            Intrinsics.g("input");
            throw null;
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.vk_captcha_hint).setPositiveButton(android.R.string.ok, new a(0, this)).setNegativeButton(android.R.string.cancel, new a(1, this)).setOnCancelListener(new b(this, 0)).show();
        EditText editText4 = this.input;
        if (editText4 == null) {
            Intrinsics.g("input");
            throw null;
        }
        editText4.requestFocus();
        loadImage();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        VKValidationLocker.INSTANCE.signal();
        super.onDestroy();
    }
}
