package io.flutter.view;

import android.media.Image;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface TextureRegistry$ImageTextureEntry {
    /* synthetic */ long id();

    void pushImage(Image image);

    /* synthetic */ void release();
}
