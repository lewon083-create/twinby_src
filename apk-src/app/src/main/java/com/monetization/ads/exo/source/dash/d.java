package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.bu;
import yads.qb2;
import yads.r30;
import yads.rb2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements rb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15033a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // yads.rb2
    public final Object a(Uri uri, r30 r30Var) throws IOException {
        String line = new BufferedReader(new InputStreamReader(r30Var, bu.f37146c)).readLine();
        try {
            Matcher matcher = f15033a.matcher(line);
            if (!matcher.matches()) {
                throw new qb2("Couldn't parse timestamp: " + line, null, true, 4);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e3) {
            throw new qb2(null, e3, true, 4);
        }
    }
}
