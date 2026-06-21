package yl;

import com.vk.api.sdk.auth.VKScope;
import com.vk.sdk.api.users.dto.UsersFields;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f45758a = s.f(UsersFields.ONLINE, UsersFields.PHOTO_50, UsersFields.PHOTO_100, UsersFields.PHOTO_200);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f45759b = j0.f(new Pair(VKScope.NOTIFY, 1), new Pair(VKScope.FRIENDS, 2), new Pair(VKScope.PHOTOS, 4), new Pair(VKScope.AUDIO, 8), new Pair(VKScope.VIDEO, 16), new Pair(VKScope.STORIES, 64), new Pair(VKScope.PAGES, 128), new Pair(VKScope.STATUS, 1024), new Pair(VKScope.NOTES, 2048), new Pair(VKScope.MESSAGES, 4096), new Pair(VKScope.WALL, 8192), new Pair(VKScope.ADS, 32768), new Pair(VKScope.OFFLINE, 65536), new Pair(VKScope.DOCS, 131072), new Pair(VKScope.GROUPS, 262144), new Pair(VKScope.NOTIFICATIONS, 524288), new Pair(VKScope.STATS, 1048576), new Pair(VKScope.EMAIL, 4194304), new Pair(VKScope.MARKET, 134217728));
}
