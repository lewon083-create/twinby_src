package a2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import g0.h;
import g0.i;
import g0.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static i a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new h(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new j(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return i.e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles b(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static boolean c(Location location) {
        return location.isMock();
    }

    public static void d(LocationManager locationManager, String str, LocationRequest locationRequest, c2.e eVar, g8.i iVar) {
        locationManager.requestLocationUpdates(str, locationRequest, eVar, iVar);
    }

    public static void e(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }

    public static LocationRequest f(e eVar) {
        long j10 = eVar.f403b;
        LocationRequest.Builder quality = new LocationRequest.Builder(j10).setQuality(eVar.f402a);
        long j11 = eVar.f404c;
        if (j11 != -1) {
            j10 = j11;
        }
        return quality.setMinUpdateIntervalMillis(j10).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(Integer.MAX_VALUE).setMinUpdateDistanceMeters(eVar.f405d).setMaxUpdateDelayMillis(0L).build();
    }
}
