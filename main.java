import java.time.Instant;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Blueberry — Frost-wake berry maturity ledger.
 * Tracks per-batch ripening windows and assigns harvest eligibility by thaw-cycle.
 * Originally designed for cross-season yield escrow in northern orchards.
 */
public final class Blueberry {
