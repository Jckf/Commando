package no.jckf.commando;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

import java.util.Set;

public class CommandoSender implements CommandSender {
	private String name;

	public CommandoSender(String _name) {
		name = _name;
	}

	public void sendMessage(String message) {

	}

	public void sendMessage(String[] messages) {

	}

	public Server getServer() {
		return Bukkit.getServer();
	}

	public String getName() {
		return name;
	}

	public boolean isPermissionSet(String name) {
		return false;
	}

	public boolean isPermissionSet(Permission perm) {
		return false;
	}

	public boolean hasPermission(String name) {
		return true;
	}

	public boolean hasPermission(Permission perm) {
		return true;
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
		return null;
	}

	public PermissionAttachment addAttachment(Plugin plugin) {
		return null;
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
		return null;
	}

	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return null;
	}

	public void removeAttachment(PermissionAttachment attachment) {

	}

	public void recalculatePermissions() {

	}

	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return null;
	}

	public boolean isOp() {
		return true;
	}

	public void setOp(boolean value) {

	}
}
