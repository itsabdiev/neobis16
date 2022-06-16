ALTER TABLE clients ADD FOREIGN KEY (client_role_id) REFERENCES client_roles(id);
ALTER TABLE orders ADD FOREIGN KEY (order_status_id) REFERENCES order_statuses(id);
ALTER TABLE orders ADD FOREIGN KEY (client_id) REFERENCES clients(id);
